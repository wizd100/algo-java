# 자료구조 공부 (Java)

직접 채팅으로 코드를 작성하고, Claude가 그대로 파일로 옮겨 정리합니다.

## 진행 방식
1. 내가 채팅으로 코드를 친다
2. 핵심 로직이 대체로 맞으면 Claude가 **보정**해서 파일로 옮긴다
   - 클래스/main 틀, 오타, 세미콜론, 대소문자, 들여쓰기 등은 알아서 보정
   - 무엇을 고쳤는지는 매번 알려준다
3. 로직 자체가 틀렸으면 고치지 않고 **힌트만** 준다
4. 내가 고쳐서 다시 친다 (모바일이라 핵심 부분만 쳐도 OK)

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
