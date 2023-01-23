interface State {
    void doAction();
}

class StartState implements State {
    public void doAction() {
        System.out.println("Player is in start state");
    }
}

class StopState implements State {
    public void doAction() {
        System.out.println("Player is in stop state");
    }
}

class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}

class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction();

        context.setState(startState);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction();

        context.setState(stopState);
        System.out.println(context.getState().toString());
    }
}