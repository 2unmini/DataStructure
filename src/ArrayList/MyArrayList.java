package ArrayList;

public class MyArrayList {
    int[] arr;

    MyArrayList(int size) { // 사이즈를 입력 받는 생성자 생성(초기 size 설정)
        this.arr = new int[size];
    }

    public void insertData(int index, int data) {  // 지정한 인덱스의 데이터 추가 메소드
        if (index < 0 || index > arr.length) { // 입력한 index가 0보다 크거나 초기 설정 된 arr크기 보다 클 경우 예외 처리
            System.out.println("index 크기 조절 해주세요.");
            return;
        }

        int[] cloneArray = this.arr.clone(); // arr배열을 복사할 또 다른 배열 생성
        this.arr = new int[this.arr.length + 1]; // arr배열 크기 +1을 하는 배열 생성

        for (int i = 0; i < cloneArray.length; i++) { // clone값을 arr배열에 넣어줌
            this.arr[i] = cloneArray[i];
        }
        for (int i = index + 1; i < this.arr.length; i++) { // 입력한 index+1보다 큰 인덱스에 cloneArray의 인덱스 -1 의 값들을 넣어줌 (값 이동)
            this.arr[i] = cloneArray[i - 1];
        }
        this.arr[index] = data;
    }
}
