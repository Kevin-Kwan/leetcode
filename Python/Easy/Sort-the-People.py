class Solution(object):
    def sortPeople(self, names, heights):
        """
        :type names: List[str]
        :type heights: List[int]
        :rtype: List[str]
        """
        dictionary = {}
        for i in range(len(names)):
            dictionary[heights[i]]=names[i]
        return [value for key, value in sorted(dictionary.items(), reverse=True)]
