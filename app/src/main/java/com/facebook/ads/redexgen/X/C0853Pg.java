package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.widget.ImageView;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@SuppressLint({"ViewConstructor"})
public final class C0853Pg extends ImageView {
    public static byte[] A03;
    public static final int A04;
    public final Paint A00;
    public final EnumC0851Pe A01;
    public final InterfaceC0852Pf A02;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{11, 47, 33, 40, 29, -40, 36, 29, 30, 44, 14, 50, 36, 43, 32, -37, 45, 36, 34, 35, 47};
    }

    static {
        A03();
        A04 = (int) (Lr.A00 * 4.0f);
    }

    public C0853Pg(C1075Xy c1075Xy, EnumC0851Pe enumC0851Pe, InterfaceC0852Pf interfaceC0852Pf) {
        super(c1075Xy);
        this.A01 = enumC0851Pe;
        this.A02 = interfaceC0852Pf;
        this.A00 = new Paint();
        this.A00.setColor(-1728053248);
        setColorFilter(-1);
        int i = A04;
        setPadding(i, i, i, i);
        boolean z = this.A01 == EnumC0851Pe.A03;
        setContentDescription(z ? A02(0, 10, 106) : A02(10, 11, 109));
        Bitmap bitmapA01 = C0770Mb.A01(EnumC0769Ma.TO_RIGHT_ARROW);
        if (z) {
            Matrix matrix = new Matrix();
            matrix.postRotate(180.0f);
            bitmapA01 = Bitmap.createBitmap(bitmapA01, 0, 0, bitmapA01.getWidth(), bitmapA01.getHeight(), matrix, true);
        }
        setImageBitmap(bitmapA01);
        setOnClickListener(new ViewOnClickListenerC0850Pd(this));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        canvas.drawCircle(width, height, Math.min(width, height), this.A00);
        super.onDraw(canvas);
    }
}
