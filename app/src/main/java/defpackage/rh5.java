package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class rh5 extends VersionedParcel {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public rh5(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new Bt7j(), new Bt7j(), new Bt7j());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void A(boolean z) {
        this.e.writeInt(z ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void C(Bundle bundle) {
        this.e.writeBundle(bundle);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void D(byte[] bArr) {
        Parcel parcel = this.e;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void E(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void G(float f) {
        this.e.writeFloat(f);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void H(int i) {
        this.e.writeInt(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void K(long j) {
        this.e.writeLong(j);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void L(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void O(String str) {
        this.e.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void P(IBinder iBinder) {
        this.e.writeStrongBinder(iBinder);
    }

    public final void S() {
        int i = this.i;
        if (i >= 0) {
            int i2 = this.d.get(i);
            Parcel parcel = this.e;
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i2);
            parcel.writeInt(iDataPosition - i2);
            parcel.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final rh5 a() {
        Parcel parcel = this.e;
        int iDataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new rh5(parcel, iDataPosition, i, i5.b(new StringBuilder(), this.h, "  "), this.a, this.b, this.c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean e() {
        return this.e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final Bundle g() {
        return this.e.readBundle(rh5.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final byte[] i() {
        Parcel parcel = this.e;
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final CharSequence j() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean l(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i3);
            int i4 = parcel.readInt();
            this.k = parcel.readInt();
            this.j += i4;
        }
        return this.k == i;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final float m() {
        return this.e.readFloat();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final int n() {
        return this.e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final long p() {
        return this.e.readLong();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final <T extends Parcelable> T r() {
        return (T) this.e.readParcelable(rh5.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final String t() {
        return this.e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final IBinder v() {
        return this.e.readStrongBinder();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void y(int i) {
        S();
        this.i = i;
        this.d.put(i, this.e.dataPosition());
        H(0);
        H(i);
    }

    public rh5(Parcel parcel, int i, int i2, String str, Bt7j<String, Method> bt7j, Bt7j<String, Method> bt7j2, Bt7j<String, Class> bt7j3) {
        super(bt7j, bt7j2, bt7j3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
