package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YD extends C7A<AnonymousClass77> {
    public static byte[] A00;
    public static String[] A01 = {"eVrT2", "NU6zFG4u0rUdQg4rmHCYhyhimIYEqcVW", "w8lzJt7", "2MtxRlAdf", "ofvbevjNzGuCdnDr", "yiSP4Q9AL7pZMBsKWJvcqboDvH4W4ekH", "Y5GBNp4gGulMUvRVJRIen52bKNtw4QSM", "rwvebAAeAhhSfHBQ"};

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[7].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A01[1] = "j0mxEJ7PXI6EdILEdAOyominFOl70E0d";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 111);
            i4++;
        }
    }

    public static void A01() {
        A00 = new byte[]{103};
    }

    static {
        A01();
    }

    public YD(long j, @Nullable AnonymousClass78 anonymousClass78, AnonymousClass77 anonymousClass77) {
        super(j, anonymousClass78, anonymousClass77, AnonymousClass79.A04);
    }

    @Override // com.facebook.ads.redexgen.X.C7A
    public final int A06() {
        return A07().A03();
    }

    @Override // com.facebook.ads.redexgen.X.C7A
    public final JSONObject A08(JSONObject jSONObject) throws JSONException {
        jSONObject.put(A00(0, 1, 126), A07().A08());
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalErrorValueTypeDef> */
    @Override // com.facebook.ads.redexgen.X.C7A
    public final boolean A0A(C7A<AnonymousClass77> c7a) {
        boolean z;
        AnonymousClass77 anonymousClass77A07 = A07();
        AnonymousClass77 anonymousClass77A08 = c7a.A07();
        boolean z2 = anonymousClass77A07.A04().equals(c7a.A07().A04()) && anonymousClass77A07.A02() == anonymousClass77A08.A02();
        if (z2 && anonymousClass77A07.A04().equals(AnonymousClass76.A08)) {
            if (anonymousClass77A07.A06() != null && anonymousClass77A07.A06().equals(anonymousClass77A08.A06()) && anonymousClass77A07.A05() != null && anonymousClass77A07.A05().equals(anonymousClass77A08.A05())) {
                String strA07 = anonymousClass77A07.A07();
                String[] strArr = A01;
                if (strArr[7].length() != strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[3] = "qacHDjQO5";
                strArr2[2] = "DaFJoXz";
                z = strA07 != null && anonymousClass77A07.A07().equals(anonymousClass77A08.A07());
            }
            return z2 & z;
        }
        return z2;
    }
}
