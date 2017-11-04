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
 * Created by jihye on 2017-11-04
 * Site       : https://www.acmicpc.net/problem/2439
 */

import java.util.*;

public class Boj2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i =1; i<N+1;i++){
            for(int j=1; j<N-j; j++) {
                System.out.print(" ");
                if(N-i == j){
                    System.out.println("*");
                }
            }
        }
    }
}

