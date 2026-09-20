package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.59, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass59 implements AudienceNetworkActivityApi, Repairable {
    public static byte[] A0P;
    public static String[] A0Q = {"6hyfNvrTK6t0uOk4ZUiKTcly4lO9QIT3", "Cx5XWQG9gTlQcsVl0OO6K9WlulTSTZ", "4fLDdlgMQ2q", "AM05mUF2qaDkDYU3MyDNTK", "rN7iVf06fBiMXo1UDWoI2bEJDxOmVmjv", "9bqAz3M9pAQkcUJXzFdGLS", "1D1uNCEUmAwDpqE", "h0QQnxfLOYpp7kAK6sPhgGYv8wQTA65G"};
    public int A00;
    public int A02;
    public long A03;
    public long A04;
    public Intent A05;
    public RelativeLayout A06;
    public C0711Jp A07;
    public EnumC0736Kq A08;

    @Nullable
    public InterfaceC0786Mr A09;
    public NN A0A;
    public OE A0B;

    @Nullable
    public C0855Pi A0C;
    public String A0D;
    public String A0E;

    @Nullable
    public String A0F;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final AudienceNetworkActivity A0L;
    public final AudienceNetworkActivityApi A0M;
    public final C1075Xy A0N;
    public final List<AnonymousClass57> A0O = new ArrayList();
    public int A01 = -1;
    public boolean A0G = false;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0P, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 111);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0P = new byte[]{-37, 7, 40, 37, 56, 42, 55, 80, 67, 68, 78, 71, 2, 86, 81, 2, 75, 80, 72, 71, 84, 2, 88, 75, 71, 89, 54, 91, 82, 71, 2, 72, 84, 81, 79, 2, 75, 80, 86, 71, 80, 86, 2, 81, 84, 2, 85, 67, 88, 71, 70, 43, 80, 85, 86, 67, 80, 69, 71, 53, 86, 67, 86, 71, -24, -11, -26, -24, -22, -5, -16, -3, -16, -5, 0, -10, -1, -4, -8, 1, 7, -25, 2, -2, -8, 1, -44, -32, -34, -97, -41, -46, -44, -42, -45, -32, -32, -36, -97, -46, -43, -28, -97, -46, -43, -29, -42, -31, -32, -29, -27, -38, -33, -40, -97, -73, -70, -65, -70, -60, -71, -48, -78, -75, -48, -61, -74, -63, -64, -61, -59, -70, -65, -72, -48, -73, -67, -64, -56, 1, 13, 11, -52, 4, -1, 1, 3, 0, 13, 13, 9, -52, -1, 2, 17, -52, 7, 12, 18, 3, 16, 17, 18, 7, 18, 7, -1, 10, -52, -1, 1, 18, 7, 20, 7, 18, 23, -3, 2, 3, 17, 18, 16, 13, 23, 3, 2, -32, -20, -22, -85, -29, -34, -32, -30, -33, -20, -20, -24, -85, -34, -31, -16, -85, -26, -21, -15, -30, -17, -16, -15, -26, -15, -26, -34, -23, -85, -31, -26, -16, -22, -26, -16, -16, -30, -31, 15, 27, 25, -38, 18, 13, 15, 17, 14, 27, 27, 23, -38, 13, 16, 31, -38, 21, 26, 32, 17, 30, 31, 32, 21, 32, 21, 13, 24, -38, 16, 21, 31, 28, 24, 13, 37, 17, 16, -23, -11, -13, -76, -20, -25, -23, -21, -24, -11, -11, -15, -76, -25, -22, -7, -76, -17, -12, -6, -21, -8, -7, -6, -17, -6, -17, -25, -14, -76, -21, -8, -8, -11, -8, 16, 28, 26, -37, 19, 14, 16, 18, 15, 28, 28, 24, -37, 14, 17, 32, -37, 22, 27, 33, 18, 31, 32, 33, 22, 33, 22, 14, 25, -37, 19, 22, 27, 22, 32, 21, 12, 14, 16, 33, 22, 35, 22, 33, 38, 54, 66, 64, 1, 57, 52, 54, 56, 53, 66, 66, 62, 1, 52, 55, 70, 1, 60, 65, 71, 56, 69, 70, 71, 60, 71, 60, 52, 63, 1, 60, 64, 67, 69, 56, 70, 70, 60, 66, 65, 1, 63, 66, 58, 58, 56, 55, 77, 94, 77, 86, 92, 49, 38, 51, 41, 56, 40, 38, 53, 42, 69, 61, 60, 65, 57, 76, 65, 71, 70, 28, 57, 76, 57, 18, 14, 3, 5, 7, 15, 7, 16, 22, -21, 6, -7, -8, -5, -3, -5, -22, -14, -3, 87, 89, 76, 75, 76, 77, 80, 85, 76, 75, 54, 89, 80, 76, 85, 91, 72, 91, 80, 86, 85, 50, 76, 96, 78, 65, 77, 81, 65, 79, 80, 48, 69, 73, 65, -7, -15, -17, -10, -57, -20, -6, -21, -8, -39, -21, -23, -11, -12, -22, -7, 45, 40, 24, 40, 43, 34, 30, 39, 45, 26, 45, 34, 40, 39, -11, -18, -23, -15, -11, -27, -55, -28, 58, 45, 41, 59, 24, 61, 52, 41};
    }

    static {
        A07();
    }

    public AnonymousClass59(AudienceNetworkActivity audienceNetworkActivity, AudienceNetworkActivityApi audienceNetworkActivityApi) {
        this.A0L = audienceNetworkActivity;
        this.A0M = audienceNetworkActivityApi;
        this.A0N = C5G.A01(audienceNetworkActivity);
        this.A0N.A0G(this);
    }

    @Nullable
    private InterfaceC0786Mr A01(Intent intent) {
        AnonymousClass56 anonymousClass56 = new AnonymousClass56(this, intent, this.A0N.A08(), this.A0N, null);
        if (this.A08 == null) {
            return null;
        }
        switch (this.A08) {
            case A06:
                return anonymousClass56.A0C(this.A06);
            case A0C:
                InterfaceC0786Mr interfaceC0786MrA0A = anonymousClass56.A0A();
                if (A0Q[7].charAt(27) == 'B') {
                    throw new RuntimeException();
                }
                A0Q[1] = "x";
                return interfaceC0786MrA0A;
            case A0B:
                return anonymousClass56.A0B();
            case A02:
                InterfaceC0786Mr interfaceC0786MrA02 = anonymousClass56.A02();
                if (A0Q[2].length() == 25) {
                    throw new RuntimeException();
                }
                A0Q[7] = "st3v0TpfdqXoPWlO02nQcse4uCAIapoF";
                return interfaceC0786MrA02;
            case A0A:
                return anonymousClass56.A09();
            case A08:
                InterfaceC0786Mr interfaceC0786MrA07 = anonymousClass56.A07();
                if (A0Q[1].length() != 0) {
                    A0Q[1] = "wwrXZHO6We2";
                    return interfaceC0786MrA07;
                }
                A0Q[1] = "bd05r2lrBXgQHiU8zhW56DndFWzJq";
                return interfaceC0786MrA07;
            case A07:
                return anonymousClass56.A06();
            case A09:
                return anonymousClass56.A08();
            case A04:
                return anonymousClass56.A05();
            case A03:
                return anonymousClass56.A03();
            case A05:
                return anonymousClass56.A04();
            default:
                return null;
        }
    }

    private void A05() {
        String str = this.A0F;
        if (str != null) {
            this.A0C = C0854Ph.A01(this.A0N, str);
            if (this.A0C != null) {
                this.A06.addView(this.A0C, new RelativeLayout.LayoutParams(-1, -1));
            }
        }
    }

    private void A06() {
        if (!this.A0J) {
            if (A0G()) {
                A0D(Q9.A03.A02());
            } else {
                A0D(A04(139, 48, 47));
            }
            this.A0J = true;
        }
    }

    private void A08(Intent intent) {
        if (JR.A0w(this.A0L)) {
            EnumC0736Kq enumC0736Kq = this.A08;
            EnumC0736Kq enumC0736Kq2 = EnumC0736Kq.A02;
            if (A0Q[2].length() == 25) {
                throw new RuntimeException();
            }
            A0Q[1] = "ROWUzhbvPevH2";
            if (enumC0736Kq != enumC0736Kq2 && Build.VERSION.SDK_INT >= 18) {
                this.A0B = new OE();
                this.A0B.A0C(intent.getStringExtra(A04(419, 11, 51)));
                this.A0B.A0B(this.A0L.getPackageName());
                long longExtra = intent.getLongExtra(A04(462, 11, 109), 0L);
                if (longExtra != 0) {
                    this.A0B.A09(longExtra);
                }
                TextView textView = new TextView(this.A0L);
                textView.setText(A04(1, 5, 84));
                textView.setTextColor(-1);
                MS.A0M(textView, Color.argb(160, 0, 0, 0));
                textView.setPadding(5, 5, 5, 5);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                layoutParams.addRule(11, -1);
                textView.setLayoutParams(layoutParams);
                AnonymousClass58 anonymousClass58 = new AnonymousClass58(this);
                textView.setOnLongClickListener(anonymousClass58);
                this.A06.setOnLongClickListener(anonymousClass58);
                this.A06.getOverlay().add(this.A0B);
            }
        }
    }

    private void A09(Intent intent, @Nullable Bundle bundle) {
        String strA04 = A04(511, 8, 85);
        String strA05 = A04(503, 8, 17);
        String strA06 = A04(438, 24, 120);
        if (bundle != null) {
            Bundle adnwSavedStateBundle = LN.A02(bundle, DynamicLoaderImpl.class.getClassLoader());
            this.A01 = adnwSavedStateBundle.getInt(strA06, -1);
            this.A0D = adnwSavedStateBundle.getString(strA05);
            this.A08 = (EnumC0736Kq) adnwSavedStateBundle.getSerializable(strA04);
            return;
        }
        this.A01 = intent.getIntExtra(strA06, -1);
        this.A0D = intent.getStringExtra(strA05);
        this.A08 = (EnumC0736Kq) intent.getSerializableExtra(strA04);
        this.A02 = intent.getIntExtra(A04(473, 16, 23), 0) * AdError.NETWORK_ERROR_CODE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    public void A0D(String str) {
        if (A04(345, 47, 100).equals(str) || Q9.A0A.A02().equals(str)) {
            this.A0I = true;
        }
        if (!A04(265, 35, 23).equals(str)) {
            String strA02 = Q9.A09.A02();
            if (A0Q[6].length() != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A0Q;
            strArr[5] = "BsUqgJlN3izr4734FAkiK4";
            strArr[3] = "DZ4pb9dksBh2p0w2isnwDh";
            if (strA02.equals(str)) {
                this.A0H = true;
            }
        } else {
            this.A0H = true;
        }
        if (A04(86, 53, 2).equals(str)) {
            finish(9);
        } else if (A04(RCHTTPStatusCodes.UNSUCCESSFUL, 45, 62).equals(str)) {
            finish(10);
        } else {
            A0F(str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(String str, C1U c1u) {
        if (this.A09 == null) {
            return;
        }
        if (this.A0A == null) {
            C1075Xy c1075Xy = this.A0N;
            this.A0A = NO.A02(c1075Xy, c1075Xy.A08(), str, c1u, this.A09, new C1245bs(this));
            this.A0A.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
        MS.A0J(this.A0A);
        MS.A0T(this.A06);
        this.A06.addView(this.A0A);
        this.A0A.A0K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(String str, @Nullable C04589a c04589a) {
        Intent intent = new Intent(str + A04(0, 1, 50) + this.A0D);
        if (c04589a != null) {
            intent.putExtra(A04(392, 5, 121), c04589a);
        }
        C2T.A00(this.A0L).A07(intent);
    }

    private boolean A0G() {
        return this.A08 == EnumC0736Kq.A0C || this.A08 == EnumC0736Kq.A0B || this.A08 == EnumC0736Kq.A05;
    }

    public final AudienceNetworkActivity A0H() {
        return this.A0L;
    }

    public final C1075Xy A0I() {
        return this.A0N;
    }

    @VisibleForTesting
    public final void A0J() {
        if (A0G()) {
            A0D(Q9.A09.A02());
        } else {
            A0D(A04(265, 35, 23));
        }
    }

    public final void A0K(AnonymousClass57 anonymousClass57) {
        this.A0O.add(anonymousClass57);
    }

    public final void A0L(AnonymousClass57 anonymousClass57) {
        this.A0O.remove(anonymousClass57);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        LU luA00 = LV.A00();
        if (luA00 != null) {
            boolean zOverrideDumpsys = luA00.overrideDumpsys(str, fileDescriptor, printWriter, strArr);
            if (A0Q[2].length() == 25) {
                throw new RuntimeException();
            }
            A0Q[6] = "QxWYw7ht1er43uY";
            if (zOverrideDumpsys) {
                return;
            }
        }
        this.A0M.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void finish(int i) {
        this.A0N.A0D().A2Q(String.valueOf(A0H().hashCode()), i);
        if (this.A0L.isFinishing()) {
            return;
        }
        if (JR.A1G(this.A0N) && !this.A0I && !this.A0H) {
            this.A0N.A0D().A9i();
            A0J();
        }
        if (A0G() && !this.A0G) {
            A0D(Q9.A05.A02());
        } else {
            A0D(A04(187, 39, 14));
        }
        A06();
        this.A0M.finish(i);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onActivityResult(int i, int i2, Intent intent) {
        InterfaceC0786Mr interfaceC0786Mr = this.A09;
        if (interfaceC0786Mr != null && interfaceC0786Mr.onActivityResult(i, i2, intent)) {
            return;
        }
        TE.A09(i, i2, intent);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onBackPressed() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.A03 += jCurrentTimeMillis - this.A04;
        this.A04 = jCurrentTimeMillis;
        if (this.A03 > this.A02) {
            boolean shouldIntercept = false;
            Iterator<AnonymousClass57> it = this.A0O.iterator();
            while (it.hasNext()) {
                if (it.next().A8M()) {
                    shouldIntercept = true;
                }
            }
            if (!shouldIntercept) {
                this.A0M.onBackPressed();
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.A00 != configuration.orientation) {
            HashMap map = new HashMap();
            int i = configuration.orientation;
            String strA04 = A04(489, 14, 74);
            if (i == 1) {
                map.put(strA04, A04(430, 8, 26));
            } else {
                map.put(strA04, A04(397, 9, 86));
            }
            this.A07.A02(EnumC0710Jo.A0K, map);
            this.A00 = configuration.orientation;
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onCreate(@Nullable Bundle bundle) {
        MU.A02();
        if (JR.A1W(this.A0L)) {
            Window window = this.A0L.getWindow();
            String[] strArr = A0Q;
            if (strArr[0].charAt(26) != strArr[4].charAt(26)) {
                throw new RuntimeException();
            }
            A0Q[6] = "7njofUp2AYjKONZ";
            window.setFlags(16777216, 16777216);
        }
        this.A05 = LN.A01(this.A0L.getIntent(), DynamicLoaderImpl.class.getClassLoader());
        C1075Xy c1075XyA03 = LN.A03(this.A05);
        if (c1075XyA03 != null) {
            this.A0N.A0E(c1075XyA03.A0D());
            this.A0N.A0B(c1075XyA03.A0A());
        }
        this.A0N.A0D().A2R(String.valueOf(A0H().hashCode()));
        this.A0L.requestWindowFeature(1);
        this.A0L.getWindow().setFlags(1024, 1024);
        this.A06 = new RelativeLayout(this.A0L);
        MS.A0M(this.A06, 0);
        this.A0L.setContentView(this.A06, new RelativeLayout.LayoutParams(-1, -1));
        A09(this.A05, bundle);
        this.A09 = A01(this.A05);
        InterfaceC0786Mr interfaceC0786Mr = this.A09;
        if (interfaceC0786Mr == null) {
            this.A0N.A06().A8y(A04(64, 11, 24), C04578z.A0A, new AnonymousClass90(A04(6, 58, 115)));
            A0J();
            finish(7);
            return;
        }
        interfaceC0786Mr.A8n(this.A05, bundle, this);
        A0D(A04(226, 39, 61));
        this.A04 = System.currentTimeMillis();
        this.A0F = this.A05.getStringExtra(A04(406, 13, 105));
        A05();
        A08(this.A05);
        this.A00 = this.A0L.getResources().getConfiguration().orientation;
        String strA04 = A04(75, 11, 36);
        if (bundle != null) {
            this.A0E = bundle.getString(strA04);
        } else {
            this.A0E = this.A05.getStringExtra(strA04);
        }
        this.A07 = new C0711Jp(this.A0E, this.A0N.A08());
        if (JR.A1e(this.A0L) && this.A0L.getWindow() != null) {
            this.A0L.getWindow().addFlags(128);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0062  */
    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onDestroy() {
        this.A0N.A0D().A2S(String.valueOf(A0H().hashCode()));
        A06();
        RelativeLayout relativeLayout = this.A06;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        InterfaceC0786Mr interfaceC0786Mr = this.A09;
        if (interfaceC0786Mr != null) {
            interfaceC0786Mr.onDestroy();
            String[] strArr = A0Q;
            if (strArr[0].charAt(26) != strArr[4].charAt(26)) {
                throw new RuntimeException();
            }
            A0Q[1] = "BK5JyIukG";
            this.A09 = null;
        }
        OE oe = this.A0B;
        String[] strArr2 = A0Q;
        if (strArr2[0].charAt(26) == strArr2[4].charAt(26)) {
            A0Q[2] = "VoJV9dI9dal5KZ60JkB8i5Bpps";
            if (oe != null) {
                if (JR.A0w(this.A0L)) {
                    this.A0B.A07();
                }
            }
        } else if (oe != null) {
            if (JR.A0w(this.A0L)) {
                this.A0B.A07();
            }
        }
        NN nn = this.A0A;
        if (A0Q[2].length() != 25) {
            String[] strArr3 = A0Q;
            strArr3[5] = "rHb3ILEFnyWtMYiOwcguj0";
            strArr3[3] = "XKBHK5KZoSEcfbvzOM5yLt";
            if (nn == null) {
                return;
            }
        } else if (nn == null) {
            return;
        }
        nn.A0J();
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onPause() {
        this.A0N.A0D().A2T(String.valueOf(A0H().hashCode()));
        this.A03 += System.currentTimeMillis() - this.A04;
        InterfaceC0786Mr interfaceC0786Mr = this.A09;
        if (interfaceC0786Mr != null) {
            interfaceC0786Mr.ABj(false);
            if (!this.A0L.isFinishing()) {
                this.A07.A02(EnumC0710Jo.A0E, null);
                this.A0K = true;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onResume() {
        this.A0N.A0D().A2U(String.valueOf(A0H().hashCode()));
        this.A04 = System.currentTimeMillis();
        InterfaceC0786Mr interfaceC0786Mr = this.A09;
        if (interfaceC0786Mr != null) {
            interfaceC0786Mr.AC8(false);
            if (this.A0K) {
                this.A07.A02(EnumC0710Jo.A0F, null);
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        InterfaceC0786Mr interfaceC0786Mr = this.A09;
        if (interfaceC0786Mr != null) {
            interfaceC0786Mr.AEI(bundle2);
        }
        bundle2.putInt(A04(438, 24, 120), this.A01);
        bundle2.putString(A04(503, 8, 17), this.A0D);
        bundle2.putString(A04(75, 11, 36), this.A0E);
        bundle2.putSerializable(A04(511, 8, 85), this.A08);
        LN.A08(bundle, bundle2);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStart() {
        this.A0N.A0D().A2V(String.valueOf(A0H().hashCode()));
        int i = this.A01;
        if (i != -1) {
            C0780Ml.A02(this.A0L, i, this.A0N);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStop() {
        this.A0N.A0D().A2W(String.valueOf(A0H().hashCode()));
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass68.A02(null, motionEvent);
        return this.A0M.onTouchEvent(motionEvent);
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        A0J();
        finish(5);
    }
}
