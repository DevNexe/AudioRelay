package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes.dex */
public final class Vn0_ {
    public static final fv a(Bitmap bitmap) {
        fv fvVarB;
        ColorSpace colorSpace = bitmap.getColorSpace();
        if (colorSpace != null && (fvVarB = b(colorSpace)) != null) {
            return fvVarB;
        }
        float[] fArr = hv.a;
        return hv.c;
    }

    public static final fv b(ColorSpace colorSpace) {
        if (ur1.a(colorSpace, ColorSpace.get(ColorSpace.Named.SRGB))) {
            return hv.c;
        }
        if (ur1.a(colorSpace, ColorSpace.get(ColorSpace.Named.ACES))) {
            return hv.o;
        }
        if (ur1.a(colorSpace, ColorSpace.get(ColorSpace.Named.ACESCG))) {
            return hv.p;
        }
        if (ur1.a(colorSpace, ColorSpace.get(ColorSpace.Named.ADOBE_RGB))) {
            return hv.m;
        }
        if (ur1.a(colorSpace, ColorSpace.get(ColorSpace.Named.BT2020))) {
            return hv.h;
        }
        if (ur1.a(colorSpace, ColorSpace.get(ColorSpace.Named.BT709))) {
            return hv.g;
        }
        if (ur1.a(colorSpace, ColorSpace.get(ColorSpace.Named.CIE_LAB))) {
            return hv.r;
        }
        if (ur1.a(colorSpace, ColorSpace.get(ColorSpace.Named.CIE_XYZ))) {
            return hv.q;
        }
        if (ur1.a(colorSpace, ColorSpace.get(ColorSpace.Named.DCI_P3))) {
            return hv.i;
        }
        if (ur1.a(colorSpace, ColorSpace.get(ColorSpace.Named.DISPLAY_P3))) {
            return hv.j;
        }
        if (ur1.a(colorSpace, ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB))) {
            return hv.e;
        }
        if (ur1.a(colorSpace, ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB))) {
            return hv.f;
        }
        if (ur1.a(colorSpace, ColorSpace.get(ColorSpace.Named.LINEAR_SRGB))) {
            return hv.d;
        }
        if (ur1.a(colorSpace, ColorSpace.get(ColorSpace.Named.NTSC_1953))) {
            return hv.k;
        }
        if (ur1.a(colorSpace, ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB))) {
            return hv.n;
        }
        return ur1.a(colorSpace, ColorSpace.get(ColorSpace.Named.SMPTE_C)) ? hv.l : hv.c;
    }

    public static final Bitmap c(int i, int i2, int i3, boolean z, fv fvVar) {
        return Bitmap.createBitmap((DisplayMetrics) null, i, i2, fp1.y0(i3), z, d(fvVar));
    }

    public static final ColorSpace d(fv fvVar) {
        ColorSpace.Named named;
        if (ur1.a(fvVar, hv.c)) {
            named = ColorSpace.Named.SRGB;
        } else if (ur1.a(fvVar, hv.o)) {
            named = ColorSpace.Named.ACES;
        } else if (ur1.a(fvVar, hv.p)) {
            named = ColorSpace.Named.ACESCG;
        } else if (ur1.a(fvVar, hv.m)) {
            named = ColorSpace.Named.ADOBE_RGB;
        } else if (ur1.a(fvVar, hv.h)) {
            named = ColorSpace.Named.BT2020;
        } else if (ur1.a(fvVar, hv.g)) {
            named = ColorSpace.Named.BT709;
        } else if (ur1.a(fvVar, hv.r)) {
            named = ColorSpace.Named.CIE_LAB;
        } else if (ur1.a(fvVar, hv.q)) {
            named = ColorSpace.Named.CIE_XYZ;
        } else if (ur1.a(fvVar, hv.i)) {
            named = ColorSpace.Named.DCI_P3;
        } else if (ur1.a(fvVar, hv.j)) {
            named = ColorSpace.Named.DISPLAY_P3;
        } else if (ur1.a(fvVar, hv.e)) {
            named = ColorSpace.Named.EXTENDED_SRGB;
        } else if (ur1.a(fvVar, hv.f)) {
            named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        } else if (ur1.a(fvVar, hv.d)) {
            named = ColorSpace.Named.LINEAR_SRGB;
        } else if (ur1.a(fvVar, hv.k)) {
            named = ColorSpace.Named.NTSC_1953;
        } else if (ur1.a(fvVar, hv.n)) {
            named = ColorSpace.Named.PRO_PHOTO_RGB;
        } else {
            named = ur1.a(fvVar, hv.l) ? ColorSpace.Named.SMPTE_C : ColorSpace.Named.SRGB;
        }
        return ColorSpace.get(named);
    }
}
