package mediator;

import javax.print.attribute.standard.Media;

public abstract class Participant {
    protected Mediator mediator;

    public Participant(Mediator mediator) {
        this.mediator = mediator;
    }
}