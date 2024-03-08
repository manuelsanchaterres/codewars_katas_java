package sortOdd;

class OddNumberInfo {

    int arrayIndex;
    int arrayItemValue;
    OddNumberInfo(int arrayIndex, int arrayItemValue){

        this.arrayIndex = arrayIndex;
        this.arrayItemValue = arrayItemValue;
    }

    int getArrayIndex() {
        return arrayIndex;
    }

    int getArrayItemValue() {
        return arrayItemValue;
    }
    void setArrayIndex(int arrayIndex) {
        this.arrayIndex = arrayIndex;
    }
    void setArrayItemValue(int arrayItemValue) {
        this.arrayItemValue = arrayItemValue;
    }
}
