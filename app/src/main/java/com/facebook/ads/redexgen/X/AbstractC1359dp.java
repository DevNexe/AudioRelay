package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1359dp extends AbstractC02460f {
    public static String A03;
    public static String A04;
    public static String A05;
    public static byte[] A06;
    public static String[] A07 = {"1", "OJ2IOsbUnCKybSqk53zM3JXcifahO", "e4RldewFXKwYCBzcZ5CwWZ5XjhlRHNiJ", "729G42gqUNiz5ZAUAxRhvFZ2YWMhTd0L", "J1Ql0tv9onNfDvsMKNTgjNyaDa6Pnzub", "9fBm", "mbPUpspz4Nj5AFGqwEe2w9x9WWs", "2uSYGuFAJgr"};
    public final boolean A00;

    @Nullable
    public final C02520m A01;
    public final boolean A02;

    public static String A0A(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 30);
            if (A07[3].charAt(0) != '7') {
                throw new RuntimeException();
            }
            A07[5] = "PWjD";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A06 = new byte[]{93, 114, 119, 125, 117, 62, 114, 113, 121, 121, 123, 122, 68, 75, 65, 87, 74, 76, 65, 11, 76, 75, 81, 64, 75, 81, 11, 68, 70, 81, 76, 74, 75, 11, 115, 108, 96, 114, 24, 27, 25, 17, 37, 14, 19, 23, 31, 46, 39, 35, 52, 39, 29, 54, 43, 47, 39, 11, 17, 16, 7, 11, 9, 1, 37, 35, 53, 53, 51, 37, 37, 76, 87, 80, 79, 92, 75, 74, 88, 85, 102, 85, 80, 87, 82, 89, 95, 73, 94, 115, 88, 94, 77, 79, 71, 73, 94, 115, 69, 95, 115, 66, 67, 88, 115, 66, 89, 64, 64, 75, 93, 72, 95, 84, 99, 93, 82, 88, 99, 94, 78, 83, 75, 79, 89};
    }

    public abstract void A0D();

    static {
        A0B();
        A03 = A0A(64, 7, 72);
        A04 = A0A(85, 24, 50);
        A05 = A0A(109, 16, 34);
    }

    public AbstractC1359dp(C1075Xy c1075Xy, InterfaceC0703Jh interfaceC0703Jh, String str, @Nullable C02520m c02520m, boolean z) {
        this(c1075Xy, interfaceC0703Jh, str, c02520m, z, false);
    }

    public AbstractC1359dp(C1075Xy c1075Xy, InterfaceC0703Jh interfaceC0703Jh, String str, @Nullable C02520m c02520m, boolean z, boolean z2) {
        super(c1075Xy, interfaceC0703Jh, str);
        this.A01 = c02520m;
        this.A02 = z;
        this.A00 = z2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02460f
    public final void A0C() {
        C02520m c02520m = this.A01;
        if (c02520m != null) {
            c02520m.A07(super.A02);
        }
        A0D();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0080  */
    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ac  */
    public final void A0E(Map<String, String> map, @Nullable EnumC02450e enumC02450e) {
        C02520m c02520m;
        if (!TextUtils.isEmpty(super.A02)) {
            if (this instanceof G2) {
                super.A01.A9M(super.A02, map);
            } else {
                InterfaceC0703Jh interfaceC0703Jh = super.A01;
                String str = super.A02;
                if (A07[6].length() != 8) {
                    A07[5] = "D2ZF";
                    interfaceC0703Jh.A96(str, map);
                } else {
                    interfaceC0703Jh.A96(str, map);
                }
            }
            boolean zA02 = EnumC02450e.A02(enumC02450e);
            if (A07[1].length() == 32) {
                throw new RuntimeException();
            }
            A07[0] = "X";
            boolean z = this.A01 != null;
            if (JR.A1h(super.A00)) {
                HashMap map2 = new HashMap();
                map2.put(A03, Boolean.toString(!zA02));
                map2.put(A04, Boolean.toString(z));
                map2.put(A05, Boolean.toString(this.A00));
                super.A01.A97(super.A02, map2);
            }
            C02520m c02520m2 = this.A01;
            if (c02520m2 != null) {
                c02520m2.A06(enumC02450e);
                if (A07[6].length() != 8) {
                    A07[6] = "4hYdj7INWre5bef3R1byHGHBMmQCX";
                    if (zA02) {
                        c02520m = this.A01;
                        if (A07[6].length() != 8) {
                            String[] strArr = A07;
                            strArr[2] = "42brCgECckKxVuTsLxKp6fXlInYi7mUj";
                            strArr[4] = "SJ7s8Rg0tKhfkKPQamVQVBa2w2xrx0QV";
                            c02520m.A05();
                        } else {
                            c02520m.A05();
                        }
                    }
                } else {
                    A07[5] = "IMSq";
                    if (zA02) {
                        c02520m = this.A01;
                        if (A07[6].length() != 8) {
                            String[] strArr2 = A07;
                            strArr2[2] = "42brCgECckKxVuTsLxKp6fXlInYi7mUj";
                            strArr2[4] = "SJ7s8Rg0tKhfkKPQamVQVBa2w2xrx0QV";
                            c02520m.A05();
                        } else {
                            c02520m.A05();
                        }
                    }
                }
            } else {
                Map<String, String> extraData = new HashMap<>();
                extraData.put(A0A(47, 10, 92), Long.toString(-1L));
                extraData.put(A0A(38, 9, 100), Long.toString(-1L));
                extraData.put(A0A(57, 7, 122), EnumC02450e.A03.name());
                super.A01.A9P(super.A02, extraData);
            }
        }
        C0751Lg.A02(super.A00, A0A(0, 12, 0));
    }

    public final boolean A0F(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter(A0A(71, 14, 39));
            if (TextUtils.isEmpty(queryParameter)) {
                return false;
            }
            Intent intent = new Intent(A0A(12, 26, 59), C0745La.A00(queryParameter));
            intent.addFlags(268435456);
            if (Build.VERSION.SDK_INT >= 30) {
                intent.addFlags(1024);
            }
            return LN.A0B(super.A00, intent);
        } catch (LL unused) {
            return false;
        }
    }
}
