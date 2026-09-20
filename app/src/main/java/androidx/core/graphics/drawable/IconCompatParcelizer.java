package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = versionedParcel.o(iconCompat.a, 1);
        byte[] bArrI = iconCompat.c;
        if (versionedParcel.l(2)) {
            bArrI = versionedParcel.i();
        }
        iconCompat.c = bArrI;
        iconCompat.d = versionedParcel.s(iconCompat.d, 3);
        iconCompat.e = versionedParcel.o(iconCompat.e, 4);
        iconCompat.f = versionedParcel.o(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) versionedParcel.s(iconCompat.g, 6);
        iconCompat.i = versionedParcel.u(7, iconCompat.i);
        iconCompat.j = versionedParcel.u(8, iconCompat.j);
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                } else {
                    byte[] bArr = iconCompat.c;
                    iconCompat.b = bArr;
                    iconCompat.a = 3;
                    iconCompat.e = 0;
                    iconCompat.f = bArr.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            versionedParcel.I(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            versionedParcel.y(2);
            versionedParcel.D(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            versionedParcel.M(parcelable, 3);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            versionedParcel.I(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            versionedParcel.I(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            versionedParcel.M(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            versionedParcel.N(7, str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            versionedParcel.N(8, str2);
        }
    }
}
