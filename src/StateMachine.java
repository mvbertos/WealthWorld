public class StateMachine<NonPlayableCharacter extends Character> {
    private NonPlayableCharacter myOwner;
    // Define o estado atual:
    private State<NonPlayableCharacter> estadoAtual;
    // Define o estado anterior:
    private State<NonPlayableCharacter> estadoAnterior;
    // Define o estado global:
    private State<NonPlayableCharacter> estadoGlobal;

    public StateMachine(NonPlayableCharacter owner) {
        myOwner = owner;
        estadoAtual = null;
        estadoAnterior = null;
        estadoGlobal = null;
    }

    // Utilize estes metodos para inicializar a state machine:
    public void setCurrentState(State<NonPlayableCharacter> s) {
        estadoAtual = s;
    }

    public void setGlobalState(State<NonPlayableCharacter> s) {
        estadoGlobal = s;
    }

    public void setPreviousState(State<NonPlayableCharacter> s) {
        estadoAnterior = s;
    }

    // Invoca este metodo para atualizar a FSM.
    public void update() {
        // Se existir um estado global, invoca o seu metodo execute,
        // caso contrario nao faz nada:
        if (estadoGlobal != null) {
            estadoGlobal.execute(myOwner);
        }
        // Idem para o estado atual:
        if (estadoAtual != null) {
            estadoAtual.execute(myOwner);
        }
    }

    // Faz a troca de estados.
    public void changeState(State<NonPlayableCharacter> novoEstado) {
        // Armazena qual o estado anterior:
        estadoAnterior = estadoAtual;

        if (estadoAtual != null)
            // Invoca o método de saida do estado atual:
            estadoAtual.exit(myOwner);

        // Faz a troca de estados:
        estadoAtual = novoEstado;
        // Invoca o metodo de Entrada do novo estado:
        estadoAtual.enter(myOwner);
    }

    // Muda para o estado anterior:
    public void revertToPreviousState() {
        changeState(estadoAnterior);
    }

    public State<NonPlayableCharacter> getCurrentState() {
        return estadoAtual;
    }

    public State<NonPlayableCharacter> getGlobalState() {
        return estadoGlobal;
    }

    public State<NonPlayableCharacter> getPreviousState() {
        return estadoAnterior;
    }

    public boolean handleMessages(Message msg) {
        
        if (estadoAtual.onMessage(myOwner, msg)) {
            return true;
        }

        if (estadoGlobal != null && estadoGlobal.onMessage(myOwner, msg)) {
            return true;
        }

        return false;
    }

}
