package com.facebook.ads.redexgen.X;

import android.os.Build;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1158aT implements InterfaceC04136v {
    public static String[] A02 = {"8IgbQbzIeG7tuzbPw4WpTReJHEXOOBaI", "uwr3gwrpCwnsdPI6tcqzo06z5LPFYArK", "KUvtzgiNenvKoXYdIGr4T", "ebtfEWeeh2etvFgGs478sf7cOArxhZcn", "MQ8ux5tmWncWP0t9wyLsU5JzQOIFN", "7dBSxWLu4PAR6eol7PDhhjCLapQyD", "DfYXUN1CCnyCs44nd3kIcNIJOWqVY6eS", "5gEsKmvQZ2K3SsZVO0OSc0798tOlDhoK"};
    public final /* synthetic */ C1156aR A00;
    public final /* synthetic */ List A01;

    public C1158aT(C1156aR c1156aR, List list) {
        this.A00 = c1156aR;
        this.A01 = list;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0053 A[PHI: r1
  0x0053: PHI (r1v10 com.facebook.ads.redexgen.X.6u) = (r1v9 com.facebook.ads.redexgen.X.6u), (r1v16 com.facebook.ads.redexgen.X.6u) binds: [B:18:0x00a9, B:10:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0063  */
    /* JADX WARN: Code duplicated, block: B:16:0x0091  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        C04126u c04126u;
        int iIntValue;
        int streamKey;
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            List list = this.A01;
            if (A02[2].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[7] = "wkxUGDPvutXhqdGlSbbbG0nh4qVsuIhH";
            strArr[1] = "9se0a2PCPvuNc9uYSGqMP0X6BOz38YUy";
            if (i >= list.size()) {
                return this.A00.A03((HashMap<Integer, C1157aS>) map);
            }
            List list2 = this.A01;
            String[] strArr2 = A02;
            if (strArr2[5].length() != strArr2[4].length()) {
                String[] strArr3 = A02;
                strArr3[7] = "w6bkI8mcFJbdIq2JUa0cw0U5M6INIj0g";
                strArr3[1] = "5vzP4JEpPTq7RU19xyhl907HqVfLv1o1";
                c04126u = (C04126u) list2.get(i);
                if (c04126u.A02()) {
                    iIntValue = ((Integer) c04126u.A01()).intValue();
                    if (Build.VERSION.SDK_INT >= 28) {
                        streamKey = this.A00.A00.getStreamMinVolume(iIntValue);
                    } else {
                        streamKey = -1;
                    }
                    int streamVolume = this.A00.A00.getStreamVolume(iIntValue);
                    int currentVolume = this.A00.A00.getStreamMaxVolume(iIntValue);
                    C1157aS audioStreamVolume = new C1157aS(streamKey, streamVolume, currentVolume);
                    map.put(Integer.valueOf(iIntValue), audioStreamVolume);
                }
            } else {
                String[] strArr4 = A02;
                strArr4[0] = "CIZgFD3PxrctzWhUemjZg0F42IFR8Khz";
                strArr4[3] = "vl3ScUwT7Dxtepa46leMofObvUClFSdC";
                c04126u = (C04126u) list2.get(i);
                if (c04126u.A02()) {
                    iIntValue = ((Integer) c04126u.A01()).intValue();
                    if (Build.VERSION.SDK_INT >= 28) {
                        streamKey = this.A00.A00.getStreamMinVolume(iIntValue);
                    } else {
                        streamKey = -1;
                    }
                    int streamVolume2 = this.A00.A00.getStreamVolume(iIntValue);
                    int currentVolume2 = this.A00.A00.getStreamMaxVolume(iIntValue);
                    C1157aS audioStreamVolume2 = new C1157aS(streamKey, streamVolume2, currentVolume2);
                    map.put(Integer.valueOf(iIntValue), audioStreamVolume2);
                }
            }
            i++;
        }
    }
}
