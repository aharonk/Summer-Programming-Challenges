class Solution:
    def __init__(self, string):
        print(self.isPathCrossing(string), end="\t")

    def isPathCrossing(self, path: str) -> bool:
        coords_visited = {(0, 0)}
        curr_coords = [0, 0]

        for char in path:

            # based on the current character, change the location we are currently in.
            if char == 'N':
                curr_coords[0] += 1
            elif char == 'S':
                curr_coords[0] -= 1
            elif char == 'E':
                curr_coords[1] += 1
            elif char == 'W':
                curr_coords[1] -= 1

            # create a tuple to add to the set, in the occasion the set does not already contain the current position. If it does, we will return True
            if (tuple_coords := tuple(curr_coords)) in coords_visited:
                return True

            coords_visited.add(tuple_coords)

        # if none of the coordinates matched up, return that the line never met itself
        return False

# testing
for string, result in {"NES": False, "NESWW": True, "NNSWWEWSSESSWENNW": True, "": False}.items():
    s = Solution(string)
    print(result)
