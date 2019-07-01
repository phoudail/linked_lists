var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":146,"id":304,"methods":[{"el":19,"sc":5,"sl":16},{"el":30,"sc":5,"sl":21},{"el":43,"sc":5,"sl":32},{"el":66,"sc":5,"sl":45},{"el":78,"sc":5,"sl":68},{"el":86,"sc":5,"sl":80},{"el":99,"sc":5,"sl":88},{"el":107,"sc":5,"sl":101},{"el":117,"sc":5,"sl":109},{"el":127,"sc":5,"sl":119},{"el":137,"sc":5,"sl":129},{"el":144,"sc":5,"sl":139}],"name":"LinkedListTest","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_12":{"methods":[{"sl":21}],"name":"addTest","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29}]},"test_15":{"methods":[{"sl":101}],"name":"setExceptTest","pass":true,"statements":[{"sl":103},{"sl":104},{"sl":105},{"sl":106}]},"test_17":{"methods":[{"sl":68}],"name":"removeAllTest","pass":true,"statements":[{"sl":70},{"sl":71},{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77}]},"test_24":{"methods":[{"sl":139}],"name":"isEmptyTest","pass":true,"statements":[{"sl":141},{"sl":142},{"sl":143}]},"test_26":{"methods":[{"sl":32}],"name":"sizeTest","pass":true,"statements":[{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42}]},"test_29":{"methods":[{"sl":109}],"name":"setTest","pass":true,"statements":[{"sl":111},{"sl":112},{"sl":113},{"sl":114},{"sl":115},{"sl":116}]},"test_30":{"methods":[{"sl":80}],"name":"getExceptTest","pass":true,"statements":[{"sl":82},{"sl":83},{"sl":84},{"sl":85}]},"test_4":{"methods":[{"sl":119}],"name":"indexOfTest","pass":true,"statements":[{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126}]},"test_5":{"methods":[{"sl":88}],"name":"getTest","pass":true,"statements":[{"sl":90},{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":98}]},"test_6":{"methods":[{"sl":45}],"name":"removeTest","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":53},{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":65}]},"test_8":{"methods":[{"sl":129}],"name":"containsTest","pass":true,"statements":[{"sl":131},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [12], [], [12], [12], [12], [12], [12], [12], [12], [], [], [26], [], [26], [26], [26], [26], [26], [26], [26], [26], [26], [], [], [6], [], [6], [6], [6], [6], [6], [6], [6], [6], [6], [6], [6], [6], [6], [6], [6], [6], [6], [6], [6], [], [], [17], [], [17], [17], [17], [17], [17], [17], [17], [17], [], [], [30], [], [30], [30], [30], [30], [], [], [5], [], [5], [5], [5], [5], [5], [5], [5], [5], [5], [], [], [15], [], [15], [15], [15], [15], [], [], [29], [], [29], [29], [29], [29], [29], [29], [], [], [4], [], [4], [4], [4], [4], [4], [4], [], [], [8], [], [8], [8], [8], [8], [8], [8], [], [], [24], [], [24], [24], [24], [], [], []]
