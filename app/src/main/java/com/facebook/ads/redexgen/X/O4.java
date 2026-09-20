package com.facebook.ads.redexgen.X;

import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class O4 extends RelativeLayout {
    public static InterfaceC0785Mq A05;
    public static byte[] A06;
    public static String[] A07 = {"CT308ms2RTF49ixw7iITcI5DvAIGWMXZ", "UVauKq3DlAHpB1vMyeeSD4Us6AaVXCYd", "G3Ivv2DNtSsvdOlvNnw6jHI40eb4uyYL", "qur6nZLrhU9XJET37yOODnXWYcrj37IJ", "OCLfHPrXkMpm02uq88EYR3Uw1JpI2kE3", "KopKmjllEHptdGx3", "mL4xXMXopKoNgp", "1VwEGJcTQNgN7iTbFc9O"};
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public AbstractC1248bv A00;
    public C1075Xy A01;
    public C02620w A02;

    @Nullable
    public TC A03;

    @Nullable
    public OV A04;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A07[6].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[2] = "hwjeWCnyrgrPOyFOaJyYR4Ki88uO9bQs";
            strArr[0] = "4m7NTkn57B9pIqsgccGzW0RoTzQfESBy";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 119);
            i4++;
        }
    }

    public static void A02() {
        A06 = new byte[]{-25, 5, 22, 19, 25, 23, 9, 16, -60, -14, 5, 24, 13, 26, 9, -60, 26, 13, 9, 27, -60, 5, 8, 9, 20, 24, 9, 22, -60, 13, 23, 18, -53, 24, -60, 7, 22, 9, 5, 24, 9, 8, -60, 20, 22, 19, 20, 9, 22, 16, 29, -5, -7, 2, -7, 6, -3, -9};
    }

    static {
        A02();
        A09 = (int) (Lr.A00 * 8.0f);
        A08 = A09 * 10;
        A0A = (int) (Lr.A00 * 15.0f);
        A05 = new TB();
    }

    public O4(C1075Xy c1075Xy) {
        super(c1075Xy);
        this.A01 = c1075Xy;
        this.A02 = new C02620w(c1075Xy);
        MS.A0K(this.A02);
        this.A00 = new FA();
        this.A00.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    private ArrayList<C0847Pa> A01(AnonymousClass18 anonymousClass18) {
        if (anonymousClass18 == null) {
            return new ArrayList<>();
        }
        List<C1B> listA0c = anonymousClass18.A0c();
        ArrayList<C0847Pa> arrayList = new ArrayList<>(listA0c.size());
        for (int i = 0; i < i; i++) {
            arrayList.add(new C0847Pa(i, listA0c.size(), listA0c.get(i)));
        }
        return arrayList;
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(UB ub, int i) {
        ArrayList<C0847Pa> arrayListA01 = A01(ub.A0z());
        this.A02.setCardsInfo(arrayListA01);
        this.A03 = new TC(this.A01, arrayListA01, ub.A0z(), this.A01.A00().A08(), ub, A05, ub.A0z().A0U(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A02.setAdapter(this.A03);
        this.A03.A0F(i - A08, 16, 0);
        this.A03.A07();
        setupDotsLayout(ub, arrayListA01);
    }

    public final void A06(C0895Qw c0895Qw) {
        TC tc = this.A03;
        if (tc != null) {
            tc.A0G(c0895Qw);
        } else {
            this.A01.A06().A8y(A00(51, 7, 29), C04578z.A1u, new AnonymousClass90(A00(0, 51, 45)));
        }
        this.A02.A22(c0895Qw);
    }

    public static InterfaceC0785Mq getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TC tc;
        if (z && (tc = this.A03) != null) {
            tc.A0F((i3 - i) - A08, 16, 0);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i) {
        OV ov = this.A04;
        if (ov != null) {
            ov.A00(i);
        }
    }

    private void setupDotsLayout(UB ub, ArrayList<C0847Pa> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Z(new TA(this));
        this.A04 = new OV(this.A01, ub.A0z().A0N().A01(), arrayList.size());
        MS.A0K(this.A04);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A0A, 0, 0);
        addView(this.A04, layoutParams);
    }
}
