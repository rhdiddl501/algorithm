/*
 * Copyright 2017 jihye hwang
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Created by jihye on 2017-10-09
 * Site       : https://www.acmicpc.net/problem/2839
 */

import java.util.*;

public class Boj2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nkg; //배달해야하는 무게
        int sum = 0;

        nkg = sc.nextInt();

        for (int i = 0; i < 1001; i++) {
            for (int j = 0; j < 1667; j++) {
                    if (nkg == (5 * i) + (3 * j)) {
                        sum = i + j; //nkg을 만들 수 없으면 무조건 0
                        }
                    }

            }
            if(sum == 0){
            System.out.println("-1");
            }
            else {
                System.out.println(sum);
            }
    }
}

