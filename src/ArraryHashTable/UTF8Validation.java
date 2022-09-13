package ArraryHashTable;

public class UTF8Validation {
//    public boolean validUtf8(int[] data) {
//        for (int i = 0; i < data.length; i++) {
//            // 248: 11111000
//            // 240: 11110000
//            // 224: 11100000
//            // 192: 11000000
//            // 128: 10000000
//            if (data[i] >= 248) {
//                return false;
//            } else if (data[i] >= 240) {
//                if (!(i + 3 < data.length && data[i + 1] >= 128 && data[i + 2] >= 128 && data[i + 3] >= 128 && data[i + 1] < 192 && data[i + 2] < 192 && data[i + 3] < 192))
//                    return false;
//                i += 3;
//            } else if (data[i] >= 224) {
//                if (!(i + 2 < data.length && data[i + 1] >= 128 && data[i + 2] >= 128 && data[i + 1] < 192 && data[i + 2] < 192))
//                    return false;
//                i += 2;
//            } else if (data[i] >= 192) {
//                if (!(i + 1 < data.length && data[i + 1] >= 128 && data[i + 1] < 192)) return false;
//                i++;
//            } else {
//                if (data[i] >= 128) return false;
//            }
//        }
//        return true;
//    }


    public boolean validUtf8(int[] data) {
        int remain = 0;
        for (var c : data) {
            if (remain == 0) {
                if (c >= 248) return false;
                else if (c >= 240) remain = 3;
                else if (c >= 224) remain = 2;
                else if (c >= 192) remain = 1;
                else if (c >= 128) return false;
            } else {
                if (!(c >= 128 && c < 192)) return false;
                remain--;
            }
        }
        return remain == 0;
    }
}
