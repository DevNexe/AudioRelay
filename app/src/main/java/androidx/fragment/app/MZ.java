package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.d61;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MZ implements Parcelable {
    public static final Parcelable.Creator<MZ> CREATOR = new QnHx();
    public String A;
    public final ArrayList<String> B;
    public final ArrayList<Bundle> C;
    public ArrayList<RBi.FJCM> D;
    public ArrayList<d61> w;
    public ArrayList<String> x;
    public CQf[] y;
    public int z;

    public class QnHx implements Parcelable.Creator<MZ> {
        @Override // android.os.Parcelable.Creator
        public final MZ createFromParcel(Parcel parcel) {
            return new MZ(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MZ[] newArray(int i) {
            return new MZ[i];
        }
    }

    public MZ() {
        this.A = null;
        this.B = new ArrayList<>();
        this.C = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.w);
        parcel.writeStringList(this.x);
        parcel.writeTypedArray(this.y, i);
        parcel.writeInt(this.z);
        parcel.writeString(this.A);
        parcel.writeStringList(this.B);
        parcel.writeTypedList(this.C);
        parcel.writeTypedList(this.D);
    }

    public MZ(Parcel parcel) {
        this.A = null;
        this.B = new ArrayList<>();
        this.C = new ArrayList<>();
        this.w = parcel.createTypedArrayList(d61.CREATOR);
        this.x = parcel.createStringArrayList();
        this.y = (CQf[]) parcel.createTypedArray(CQf.CREATOR);
        this.z = parcel.readInt();
        this.A = parcel.readString();
        this.B = parcel.createStringArrayList();
        this.C = parcel.createTypedArrayList(Bundle.CREATOR);
        this.D = parcel.createTypedArrayList(RBi.FJCM.CREATOR);
    }
}
