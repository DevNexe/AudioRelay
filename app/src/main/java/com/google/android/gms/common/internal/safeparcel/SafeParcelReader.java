package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.GM;
import defpackage.Md5A;
import defpackage.a42;
import defpackage.i5;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class SafeParcelReader {

    public static class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    public static Bundle a(Parcel parcel, int i) {
        int iM = m(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iM);
        return bundle;
    }

    public static byte[] b(Parcel parcel, int i) {
        int iM = m(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iM);
        return bArrCreateByteArray;
    }

    public static <T extends Parcelable> T c(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iM = m(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iM);
        return tCreateFromParcel;
    }

    public static String d(Parcel parcel, int i) {
        int iM = m(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iM);
        return string;
    }

    public static String[] e(Parcel parcel, int i) {
        int iM = m(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iM);
        return strArrCreateStringArray;
    }

    public static ArrayList<String> f(Parcel parcel, int i) {
        int iM = m(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iM);
        return arrayListCreateStringArrayList;
    }

    public static <T> T[] g(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iM = m(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iM);
        return tArr;
    }

    public static void h(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new ParseException(GM.a("Overread allowed size end=", i), parcel);
        }
    }

    public static boolean i(Parcel parcel, int i) {
        q(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder j(Parcel parcel, int i) {
        int iM = m(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iM);
        return strongBinder;
    }

    public static int k(Parcel parcel, int i) {
        q(parcel, i, 4);
        return parcel.readInt();
    }

    public static long l(Parcel parcel, int i) {
        q(parcel, i, 8);
        return parcel.readLong();
    }

    public static int m(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void n(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m(parcel, i));
    }

    public static int o(Parcel parcel) {
        int i = parcel.readInt();
        int iM = m(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (((char) i) != 20293) {
            throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iM + iDataPosition;
        if (i2 < iDataPosition || i2 > parcel.dataSize()) {
            throw new ParseException(Md5A.e("Size read is invalid start=", iDataPosition, " end=", i2), parcel);
        }
        return i2;
    }

    public static void p(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        throw new ParseException(i5.b(a42.a("Expected size ", i2, " got ", i, " (0x"), Integer.toHexString(i), ")"), parcel);
    }

    public static void q(Parcel parcel, int i, int i2) {
        int iM = m(parcel, i);
        if (iM == i2) {
            return;
        }
        throw new ParseException(i5.b(a42.a("Expected size ", i2, " got ", iM, " (0x"), Integer.toHexString(iM), ")"), parcel);
    }
}
