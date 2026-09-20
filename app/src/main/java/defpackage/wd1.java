package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wd1 {
    public static final wd1 a = new wd1();
    public static final mk b;
    public static final String[] c;
    public static final String[] d;
    public static final String[] e;

    static {
        mk mkVar = new mk(kd.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n"));
        mkVar.y = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n";
        b = mkVar;
        c = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        d = new String[64];
        String[] strArr = new String[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            strArr[i2] = qf5.i("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
        }
        e = strArr;
        String[] strArr2 = d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        strArr2[1 | 8] = ur1.d("|PADDED", "END_STREAM");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i3 = 0;
        while (i3 < 3) {
            int i4 = iArr2[i3];
            i3++;
            int i5 = iArr[0];
            String[] strArr3 = d;
            int i6 = i5 | i4;
            StringBuilder sb = new StringBuilder();
            sb.append((Object) strArr3[i5]);
            sb.append('|');
            sb.append((Object) strArr3[i4]);
            strArr3[i6] = sb.toString();
            strArr3[i6 | 8] = ((Object) strArr3[i5]) + '|' + ((Object) strArr3[i4]) + "|PADDED";
        }
        int length = d.length;
        while (i < length) {
            int i7 = i + 1;
            String[] strArr4 = d;
            if (strArr4[i] == null) {
                strArr4[i] = e[i];
            }
            i = i7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    public static String a(boolean z, int i, int i2, int i3, int i4) {
        String strV;
        String[] strArr = c;
        String strI = i3 < strArr.length ? strArr[i3] : qf5.i("0x%02x", Integer.valueOf(i3));
        if (i4 == 0) {
            strV = "";
        } else {
            String[] strArr2 = e;
            if (i3 == 2 || i3 == 3) {
                strV = strArr2[i4];
            } else if (i3 == 4 || i3 == 6) {
                strV = i4 == 1 ? "ACK" : strArr2[i4];
            } else if (i3 == 7 || i3 == 8) {
                strV = strArr2[i4];
            } else {
                String[] strArr3 = d;
                String str = i4 < strArr3.length ? strArr3[i4] : strArr2[i4];
                if (i3 != 5 || (i4 & 4) == 0) {
                    strV = (i3 != 0 || (i4 & 32) == 0) ? str : iv4.v(str, "PRIORITY", "COMPRESSED");
                } else {
                    strV = iv4.v(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return qf5.i("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strI, strV);
    }
}
