package inge2.dataflow.pointstoanalysis;

public class Axis {
    public String leftNode;
    public String fieldName;
    public String rightNode;

    public Axis(String leftNode, String fieldName, String rightNode) {
        this.leftNode = leftNode;
        this.fieldName = fieldName;
        this.rightNode = rightNode;
    }

    @Override
    public String toString(){
        return "(" + leftNode + ", " + fieldName + ", " + rightNode + ")";
    }

    @Override
    public boolean equals(Object other){
        if (other == null) return false;
        if (other == this) return true;
        if (!(other instanceof Axis))return false;
        Axis otherMyClass = (Axis)other;
        return 	this.leftNode.equals(otherMyClass.leftNode) &&
                this.fieldName.equals(otherMyClass.fieldName) &&
                this.rightNode.equals(otherMyClass.rightNode);
    }

    public int hashCode() {
        int result = 0;
        result = 31*result + (leftNode !=null ? leftNode.hashCode() : 0);
        result = 31*result + (fieldName !=null ? fieldName.hashCode() : 0);
        result = 31*result + (rightNode !=null ? rightNode.hashCode() : 0);

        return result;
    }
}
