package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.an, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1178an implements InterfaceC04136v {
    public static String[] A01 = {"hvm87xlnXDULJgpudJIAxjipYcLfVpPe", "aPn41y0iNcbQ3vA5A69njqeDstAsTpsV", "WXmwgMFdLW61FUxTxJC7XlBGpuRVL7Wu", "ePkGYIfh56SCQIxOGTOw2FZrMqM6oOvD", "H4G3VitdwZHOwCvFNAwNX1rKXwUNte3T", "QqBVensdyxYwCHnIBjshd9TsYmlVQcVc", "Npnx1Hqps9YG5SIKMksWN5UpsP86zlug", "K4PmfDIjqE3AfePNsovy4"};
    public final /* synthetic */ C1163aY A00;

    public C1178an(C1163aY c1163aY) {
        this.A00 = c1163aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() throws Exception {
        String strA06 = this.A00.A03.A06(10005);
        if (strA06 != null) {
            C1163aY c1163aY = this.A00;
            if (A01[7].length() != 21) {
                throw new RuntimeException();
            }
            A01[7] = "XG8OcIRWX82QEKbSmFw2M";
            return c1163aY.A08(strA06);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
