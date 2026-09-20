package defpackage;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class d61 implements Parcelable {
    public static final Parcelable.Creator<d61> CREATOR = new QnHx();
    public final int A;
    public final String B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final Bundle F;
    public final boolean G;
    public final int H;
    public Bundle I;
    public final String w;
    public final String x;
    public final boolean y;
    public final int z;

    public class QnHx implements Parcelable.Creator<d61> {
        @Override // android.os.Parcelable.Creator
        public final d61 createFromParcel(Parcel parcel) {
            return new d61(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final d61[] newArray(int i) {
            return new d61[i];
        }
    }

    public d61(Fragment fragment) {
        this.w = fragment.getClass().getName();
        this.x = fragment.A;
        this.y = fragment.I;
        this.z = fragment.R;
        this.A = fragment.S;
        this.B = fragment.T;
        this.C = fragment.W;
        this.D = fragment.H;
        this.E = fragment.V;
        this.F = fragment.B;
        this.G = fragment.U;
        this.H = fragment.g0.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.w);
        sb.append(" (");
        sb.append(this.x);
        sb.append(")}:");
        if (this.y) {
            sb.append(" fromLayout");
        }
        int i = this.A;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.B;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.C) {
            sb.append(" retainInstance");
        }
        if (this.D) {
            sb.append(" removing");
        }
        if (this.E) {
            sb.append(" detached");
        }
        if (this.G) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.w);
        parcel.writeString(this.x);
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeInt(this.z);
        parcel.writeInt(this.A);
        parcel.writeString(this.B);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeBundle(this.F);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeBundle(this.I);
        parcel.writeInt(this.H);
    }

    public d61(Parcel parcel) {
        this.w = parcel.readString();
        this.x = parcel.readString();
        this.y = parcel.readInt() != 0;
        this.z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readString();
        this.C = parcel.readInt() != 0;
        this.D = parcel.readInt() != 0;
        this.E = parcel.readInt() != 0;
        this.F = parcel.readBundle();
        this.G = parcel.readInt() != 0;
        this.I = parcel.readBundle();
        this.H = parcel.readInt();
    }
}
