package mediatheque;

public class PrintOnlyCDVisitor implements ItemVisitor{


    @Override
    public void visit(Book book) {
        //Rien
    }

    @Override
    public void visit(CD cd) {
        System.out.println("CD : " + cd.getTitle() + " "+ cd.getNumberOfTracks());
    }

}
