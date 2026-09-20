package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C02500j {
    public static byte[] A00;
    public static String[] A01 = {"4Fi3cRKjKwjo", "pfwDmZC0EgnSHGG3akphHDiSxRpjxWfc", "OwKyFlCBYoW0NHpoiuFf2exuC", "FTixXnraWBf7yQ9sseM6khJqknPB2", "87lno6sBf8EnLpq9v2WrftgOrdI4V", "hcLSbPhFObKmfxN2jEGb0Jf71EM4", "MV7VLhl", "AE1L1nhQpeYYJvXkfFkincgpQRIdvuit"};

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 56);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{101, 64, 4, 77, 87, 4, 77, 74, 82, 69, 72, 77, 64, 69, 80, 65, 64, 4, 83, 77, 80, 76, 75, 81, 80, 4, 80, 75, 79, 65, 74, 10, 10, 27, 2};
    }

    static {
        A02();
    }

    @Nullable
    public static Collection<String> A01(@Nullable JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < i; i++) {
            hashSet.add(jSONArray.optString(i));
        }
        return hashSet;
    }

    public static boolean A03(C1075Xy c1075Xy, InterfaceC02490i interfaceC02490i, InterfaceC0703Jh interfaceC0703Jh) {
        EnumC02480h enumC02480hA6p = interfaceC02490i.A6p();
        if (enumC02480hA6p == null || enumC02480hA6p == EnumC02480h.A03) {
            return false;
        }
        boolean z = false;
        Collection<String> collectionA6O = interfaceC02490i.A6O();
        if (collectionA6O == null || collectionA6O.isEmpty()) {
            return false;
        }
        for (String packageName : collectionA6O) {
            if (M0.A04(c1075Xy, packageName)) {
                z = true;
                break;
            }
        }
        if (z != (enumC02480hA6p == EnumC02480h.A02)) {
            return false;
        }
        String strA65 = interfaceC02490i.A65();
        boolean zIsEmpty = TextUtils.isEmpty(strA65);
        String[] strArr = A01;
        if (strArr[7].charAt(25) != strArr[1].charAt(25)) {
            throw new RuntimeException();
        }
        A01[2] = "Y0XUyINdugWnNFuKX72emGLWk";
        if (!zIsEmpty) {
            interfaceC0703Jh.A94(strA65, null);
            return true;
        }
        InterfaceC04568y interfaceC04568yA06 = c1075Xy.A06();
        int i = C04578z.A0Z;
        String packageName2 = A00(0, 32, 28);
        AnonymousClass90 anonymousClass90 = new AnonymousClass90(packageName2);
        String packageName3 = A00(32, 3, 83);
        interfaceC04568yA06.A8y(packageName3, i, anonymousClass90);
        return true;
    }
}
