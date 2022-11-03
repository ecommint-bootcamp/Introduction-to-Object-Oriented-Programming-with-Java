packageorg.javaturk.oopj.ch08.eceulkuuu_hw1.PointDistance;

importjava.util.Objects;

publicclassPoint{

    privatedoublex;
    privatedoubley;

    Point(){
      this(0,0);
    }

    Point(doublex){
        this(x,0);
    }

    Point(doublex, doubley){
        this.x= x;
        this.y= y;
    }

    publicvoidsetX(doublex) {
        this.x= x;
    }

    publicvoidsetY(doubley) {
        this.y= y;
    }

    publicdoublegetX() {
        returnx;
    }

    publicdoublegetY() {
        returny;
    }

    publicdoubledistance(doublex, doubley) {
        returnMath.sqrt((this.x- x) * (this.x- x) + (this.y) * (this.y));
    }

    publicdoubledistance(doublex){
        returndistance(x, 0);
    }

    publicdoubledistance(){
        returndistance(0, 0);
    }

    publicdoubledistance(Pointp){
        returndistance(p.x, p.y);
    }

    @Override
    publicPointclone() {
        returnnewPoint(x, y);
    }

    publicvoidmove(doublex, doubley) {

        this.x+= x;
        this.y+= y;
    }

    publicvoidmove(doublex) {
        move(x, 0);
    }

    @Override
    publicbooleanequals(Objectobj) {
        if(super.equals(obj))
            returntrue;

        if(obj== null)
            returnfalse;

        if(!(objinstanceofPoint)) {
            returnfalse;
        }

        return((Point) obj).getX() == x&& ((Point) obj).getY() == y;
    }

    @Override
    publicStringtoString() {
        return"x="+ x+", y="+ y;
    }

    @Override
    publicinthashCode() {
        returnObjects.hash(x, y);
    }
}
