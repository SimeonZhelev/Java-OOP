package Exercise05_Polymorphism.Word_03;
public class CutTransform implements TextTransform{

    private StringBuilder lastCut = new StringBuilder();
    @Override
    public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
        this.lastCut = new StringBuilder();
        this.lastCut.append(text.substring(startIndex,endIndex));
        text.delete(startIndex, endIndex);

    }
    public StringBuilder getLastCut() {
        return lastCut;
    }
}