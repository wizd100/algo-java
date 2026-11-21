# 자료구조 공부 (Java)

직접 채팅으로 코드를 작성하고, Claude가 그대로 파일로 옮겨 정리합니다.

## 진행 방식
1. 내가 채팅으로 코드를 친다
2. Claude는 **수정 없이 그대로** 파일로 옮긴다 (오타·버그도 그대로)
3. 컴파일/실행 결과를 보여주고, 문제가 있으면 **힌트만** 준다
4. 내가 고쳐서 다시 친다

## 실행
```bash
cd data-structures
javac -d out src/**/*.java && java -cp out <패키지.클래스>
```

## 로드맵
- [ ] 01 배열 (Array) / 동적 배열 (ArrayList 직접 구현)
- [ ] 02 연결 리스트 (Singly / Doubly Linked List)
- [ ] 03 스택 (Stack)
- [ ] 04 큐 (Queue, Circular Queue, Deque)
- [ ] 05 해시 테이블 (Hash Table)
- [ ] 06 트리 / 이진 탐색 트리 (BST)
- [ ] 07 힙 / 우선순위 큐 (Heap)
- [ ] 08 그래프 (인접 행렬 / 인접 리스트, DFS / BFS)
