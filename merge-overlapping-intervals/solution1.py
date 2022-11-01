def merge_overlapping_intervals(intervals):

    i = 0

    while i < len(intervals):

        first = intervals[i][0]
        second = intervals[i][1]

        j = i + 1
        while j < len(intervals):

            next_first = intervals[j][0]
            next_second = intervals[j][1]

            if second >= next_first:
                intervals[i][1] = next_second
                second = next_second
                intervals.pop(j)
                j -= 1
            else:
                break

            j += 1

        i += 1

    return intervals


if __name__ == '__main__':
    print(merge_overlapping_intervals([[1, 2], [3, 5], [4, 7], [6, 8], [9, 10]]))

