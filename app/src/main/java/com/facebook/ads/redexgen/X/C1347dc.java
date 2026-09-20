package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.util.Log;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1347dc implements InterfaceC02530n, InterfaceC02681c {
    public static byte[] A0B;
    public static String[] A0C = {"PgLDGrk3t3a26fQCrT3IpIrRB5PMNBKm", "uls9HIPpriPjzjIXJVTR7HWmS4IMGzWu", "f2YRmtND2fanruA3kJYGXgN9aGwgjawI", "EZdssni07U2TMPMup9RmA63S0tAhTBNo", "xilKUxawUAlWzUTJOedtCKHAHwNBDRxA", "SxIuirRfQS0L7ik0LzQXw", "dF8CYh", "NQmOIXzIEfwTEqDrM9Z7TuMEUTKSiMNX"};
    public long A00;
    public RewardData A01;
    public InterfaceC02630x A02;
    public C02640y A03;
    public C02691d A04;
    public C1075Xy A05;
    public String A06;

    @Nullable
    public String A07;
    public String A08;
    public boolean A09;
    public final String A0A = UUID.randomUUID().toString();

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        byte[] bArr = {78, 108, 99, 42, 121, 45, 126, 121, 108, 127, 121, 45, 76, 120, 105, 100, 104, 99, 110, 104, 67, 104, 121, 122, 98, 127, 102, 76, 110, 121, 100, 123, 100, 121, 116, 35, 45, 64, 108, 102, 104, 45, 126, 120, 127, 104, 45, 121, 101, 108, 121, 45, 100, 121, 42, 126, 45, 100, 99, 45, 116, 98, 120, 127, 45, 76, 99, 105, 127, 98, 100, 105, 64, 108, 99, 100, 107, 104, 126, 121, 35, 117, 96, 97, 45, 107, 100, 97, 104, 35, 73, 77, 78, 122, 107, 102, 106, 97, 108, 106, 65, 106, 123, 120, 96, 125, 100, 68, 37, 42, 27, 37, 39, 48, 45, 50, 45, 48, 61, 93, 82, 87, 91, 80, 74, 106, 81, 85, 91, 80, 17, 25, 24, 21, 29, 8, 21, 19, 18, 56, 29, 8, 29, 52, 40, 37, 39, 33, 41, 33, 42, 48, 13, 32, 4, 6, 17, 16, 17, 18, 29, 26, 17, 16, 59, 6, 29, 17, 26, 0, 21, 0, 29, 27, 26, 63, 17, 13, 117, 98, 118, 114, 98, 116, 115, 83, 110, 106, 98, 29, 6, 1, 25, 29, 13, 33, 12, 38, 57, 53, 39, 4, 41, 32, 53, 80, 78, 73, 67, 72, 80};
        if (A0C[1].charAt(29) == 'g') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "6qgGoSyjmuhDFT94hunOHzgd3UUS7LMQ";
        strArr[0] = "q1PjRK7gg6WFD8n4pAFO870HLaNMi7ir";
        A0B = bArr;
    }

    static {
        A05();
    }

    private int A00() {
        int rotation = ((WindowManager) this.A05.getSystemService(A03(205, 6, 47))).getDefaultDisplay().getRotation();
        OH adOrientation = A02();
        if (adOrientation == OH.A06) {
            return -1;
        }
        if (adOrientation == OH.A04) {
            if (rotation != 2 && rotation != 3) {
                return 0;
            }
            if (A0C[1].charAt(29) == 'g') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[3] = "WCZdwi0h9oyTFk4ywD5LtkOxTOpQ29Yc";
            strArr[7] = "4yy96Y2PoNFTEE84mLwUlYETryPZgGhE";
            return 8;
        }
        if (rotation != 2) {
            return 1;
        }
        return 9;
    }

    private final EnumC0736Kq A01() {
        return this.A04.A0C();
    }

    private OH A02() {
        return this.A04.A0D();
    }

    private void A04() {
        this.A09 = true;
    }

    private void A06(Intent intent) {
        C02691d c02691d = this.A04;
        RewardData rewardData = this.A01;
        c02691d.A0G(intent, rewardData, C0864Pr.A03(rewardData, this.A0A, this.A06));
    }

    private final void A07(C1075Xy c1075Xy, InterfaceC02630x interfaceC02630x, C02821q c02821q, EnumSet<CacheFlag> enumSet, @Nullable String str) {
        this.A04 = new C02691d(c1075Xy, c02821q, this, str);
        this.A04.A0H(c1075Xy, enumSet);
    }

    private void A08(EnumC0736Kq enumC0736Kq) {
        if (enumC0736Kq.equals(EnumC0736Kq.A07)) {
            this.A05.A0D().AEj(EnumC02430c.A03);
            return;
        }
        if (enumC0736Kq.equals(EnumC0736Kq.A08)) {
            this.A05.A0D().AEj(EnumC02430c.A07);
            return;
        }
        if (enumC0736Kq.equals(EnumC0736Kq.A0A)) {
            this.A05.A0D().AEj(EnumC02430c.A09);
            return;
        }
        if (enumC0736Kq.equals(EnumC0736Kq.A09)) {
            this.A05.A0D().AEj(EnumC02430c.A08);
            return;
        }
        if (!enumC0736Kq.equals(EnumC0736Kq.A03)) {
            return;
        }
        if (this.A04.A0J()) {
            C0R c0rA0D = this.A05.A0D();
            String[] strArr = A0C;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0C[2] = "SZ1DhKHJxqFOmux8c4F7iNiG5ZFRRvjL";
            c0rA0D.AEj(EnumC02430c.A04);
            return;
        }
        if (this.A04.A0I()) {
            this.A05.A0D().AEj(EnumC02430c.A06);
        } else {
            this.A05.A0D().AEj(EnumC02430c.A05);
        }
    }

    public final AnonymousClass18 A09() {
        return this.A04.A0B();
    }

    public final void A0A(C1075Xy c1075Xy, InterfaceC02630x interfaceC02630x, C02821q c02821q, EnumSet<CacheFlag> enumSet, @Nullable String str, @Nullable String str2, @Nullable RewardData rewardData) {
        this.A05 = c1075Xy;
        this.A02 = interfaceC02630x;
        this.A08 = c02821q.A02();
        String str3 = this.A08;
        this.A06 = str3 != null ? str3.split(A03(107, 1, 19))[0] : A03(0, 0, 5);
        this.A00 = c02821q.A00();
        this.A07 = str2;
        this.A01 = rewardData;
        A07(c1075Xy, interfaceC02630x, c02821q, enumSet, str);
    }

    public final boolean A0B() {
        if (!this.A09) {
            InterfaceC02630x interfaceC02630x = this.A02;
            if (interfaceC02630x != null) {
                interfaceC02630x.AB5(this, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            }
            return false;
        }
        AdActivityIntent adActivityIntentA04 = LN.A04(this.A05);
        adActivityIntentA04.putExtra(A03(154, 24, 124), A00());
        adActivityIntentA04.putExtra(A03(189, 8, 96), this.A0A);
        adActivityIntentA04.putExtra(A03(143, 11, 76), this.A08);
        adActivityIntentA04.putExtra(A03(178, 11, 15), this.A00);
        EnumC0736Kq enumC0736KqA01 = A01();
        A08(enumC0736KqA01);
        adActivityIntentA04.putExtra(A03(197, 8, 88), enumC0736KqA01);
        String str = this.A07;
        if (str != null) {
            adActivityIntentA04.putExtra(A03(130, 13, 116), str);
        }
        A06(adActivityIntentA04);
        adActivityIntentA04.addFlags(268435456);
        adActivityIntentA04.putExtra(A03(119, 11, 54), this.A04.A0E());
        try {
            ActivityUtils.A03(this.A05);
            LN.A09(this.A05, adActivityIntentA04);
            return true;
        } catch (LL e) {
            Throwable cause = e.getCause();
            LL cause2 = e;
            if (cause != null) {
                cause2 = e.getCause();
            }
            this.A05.A06().A8y(A03(108, 11, 76), C04578z.A0D, new AnonymousClass90(cause2));
            Log.e(A03(90, 17, 7), A03(0, 90, 5), cause2);
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02530n
    @Nullable
    public final String A65() {
        return this.A04.A0E();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02530n
    public final AdPlacementType A7B() {
        return AdPlacementType.INTERSTITIAL;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02681c
    public final void A9u(AdError adError) {
        InterfaceC02630x interfaceC02630x = this.A02;
        if (interfaceC02630x != null) {
            interfaceC02630x.AB5(this, adError);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02681c
    public final void A9v() {
        A04();
        this.A02.AB4(this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02681c
    public final void ADj() {
        this.A03 = new C02640y(this.A05, this.A0A, this, this.A02);
        this.A03.A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02681c
    public final void AFH() {
        C02640y c02640y = this.A03;
        if (c02640y != null) {
            c02640y.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02530n
    public final void onDestroy() {
        C02691d c02691d = this.A04;
        if (c02691d != null) {
            c02691d.A0F();
        }
    }
}
