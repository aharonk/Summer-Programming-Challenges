class Solution:
    def __init__(self, string):
        print(self.isPathCrossing(string), end="\t")

    def isPathCrossing(self, path: str) -> bool:
        coords_visited = {(0, 0)}
        curr_coords = [0, 0]

        for char in path:

            if char == 'N':
                curr_coords[0] += 1
            elif char == 'S':
                curr_coords[0] -= 1
            elif char == 'E':
                curr_coords[1] += 1
            elif char == 'W':
                curr_coords[1] -= 1

            if (tuple_coords := tuple(curr_coords)) in coords_visited:
                return True

            coords_visited.add(tuple_coords)

        return False

for string, result in {"NES": False, "NESWW": True, "NNSWWEWSSESSWENNW": True, "": False}.items():
    s = Solution(string)
    print(result)
