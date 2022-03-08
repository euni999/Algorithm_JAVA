package BOJ;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_15552 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // int형으로 바꿔줌
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write((A+B) + "\n");
        }
        br.close();
        bw.flush();  // 버퍼 비우기
        bw.close();
    }
}

/*
Scanner를 쓰는 것 보다 BufferReader, BufferWriter를 쓰는 것이 속도가 빠르다
StringTokenizer()은 값이 없는 경우 그냥 지나가는 코드이다 , 문자열 분리
 */
