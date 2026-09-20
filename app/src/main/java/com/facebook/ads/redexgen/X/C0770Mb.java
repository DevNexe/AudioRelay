package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0770Mb {
    public static Bitmap A00(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.setScale(-1.0f, 1.0f);
        matrix.postTranslate(bitmap.getWidth(), 0.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap A01(EnumC0769Ma enumC0769Ma) {
        byte[] bArrDecode = Base64.decode(enumC0769Ma.A00(Lr.A00), 0);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static Bitmap A02(EnumC0769Ma enumC0769Ma) {
        byte[] bArrDecode = Base64.decode(enumC0769Ma.A00(Lr.A00), 0);
        return A00(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
    }

    public static Drawable A03(C1075Xy c1075Xy, EnumC0769Ma enumC0769Ma) {
        return new BitmapDrawable(c1075Xy.getResources(), A01(enumC0769Ma));
    }
}
