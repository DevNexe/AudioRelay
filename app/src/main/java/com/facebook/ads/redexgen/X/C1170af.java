package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1170af implements InterfaceC04136v {
    public static String[] A01 = {"CyYconlRA", "Z99FvxWAH", "r", "I6nMbGSwO", "f1HEaIkkO6UN2Wyn2K6t6YhOL5YQHMub", "q7TOnFp8MDH9pVcAi7q7X5O", "kHDnEbJrZHu3VwOwnck16fHaeHzzt8", "W41og5bN"};
    public final /* synthetic */ C1163aY A00;

    public C1170af(C1163aY c1163aY) {
        this.A00 = c1163aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        if (this.A00.A01 != null) {
            C1163aY c1163aY = this.A00;
            String[] strArr = A01;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A01[2] = "ZWV";
            return c1163aY.A08(c1163aY.A01.sourceDir);
        }
        C1163aY c1163aY2 = this.A00;
        if (A01[6].length() == 14) {
            return c1163aY2.A07(AnonymousClass76.A07);
        }
        A01[6] = "1VAENbmq7tYIb9ZQI0D0jEbiw3q";
        return c1163aY2.A07(AnonymousClass76.A07);
    }
}
