package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class CQf implements Parcelable {
    public static final Parcelable.Creator<CQf> CREATOR = new QnHx();
    public final int A;
    public final String B;
    public final int C;
    public final int D;
    public final CharSequence E;
    public final int F;
    public final CharSequence G;
    public final ArrayList<String> H;
    public final ArrayList<String> I;
    public final boolean J;
    public final int[] w;
    public final ArrayList<String> x;
    public final int[] y;
    public final int[] z;

    public class QnHx implements Parcelable.Creator<CQf> {
        @Override // android.os.Parcelable.Creator
        public final CQf createFromParcel(Parcel parcel) {
            return new CQf(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CQf[] newArray(int i) {
            return new CQf[i];
        }
    }

    public CQf(androidx.fragment.app.QnHx qnHx) {
        int size = qnHx.a.size();
        this.w = new int[size * 5];
        if (!qnHx.g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.x = new ArrayList<>(size);
        this.y = new int[size];
        this.z = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Xn1.QnHx qnHx2 = qnHx.a.get(i);
            int i3 = i2 + 1;
            this.w[i2] = qnHx2.a;
            ArrayList<String> arrayList = this.x;
            Fragment fragment = qnHx2.b;
            arrayList.add(fragment != null ? fragment.A : null);
            int[] iArr = this.w;
            int i4 = i3 + 1;
            iArr[i3] = qnHx2.c;
            int i5 = i4 + 1;
            iArr[i4] = qnHx2.d;
            int i6 = i5 + 1;
            iArr[i5] = qnHx2.e;
            iArr[i6] = qnHx2.f;
            this.y[i] = qnHx2.g.ordinal();
            this.z[i] = qnHx2.h.ordinal();
            i++;
            i2 = i6 + 1;
        }
        this.A = qnHx.f;
        this.B = qnHx.h;
        this.C = qnHx.r;
        this.D = qnHx.i;
        this.E = qnHx.j;
        this.F = qnHx.k;
        this.G = qnHx.l;
        this.H = qnHx.m;
        this.I = qnHx.n;
        this.J = qnHx.o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.w);
        parcel.writeStringList(this.x);
        parcel.writeIntArray(this.y);
        parcel.writeIntArray(this.z);
        parcel.writeInt(this.A);
        parcel.writeString(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        TextUtils.writeToParcel(this.E, parcel, 0);
        parcel.writeInt(this.F);
        TextUtils.writeToParcel(this.G, parcel, 0);
        parcel.writeStringList(this.H);
        parcel.writeStringList(this.I);
        parcel.writeInt(this.J ? 1 : 0);
    }

    public CQf(Parcel parcel) {
        this.w = parcel.createIntArray();
        this.x = parcel.createStringArrayList();
        this.y = parcel.createIntArray();
        this.z = parcel.createIntArray();
        this.A = parcel.readInt();
        this.B = parcel.readString();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.F = parcel.readInt();
        this.G = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.H = parcel.createStringArrayList();
        this.I = parcel.createStringArrayList();
        this.J = parcel.readInt() != 0;
    }
}
