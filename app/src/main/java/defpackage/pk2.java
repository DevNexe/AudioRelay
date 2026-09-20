package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.YKK;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class pk2 implements Parcelable {
    public static final Parcelable.Creator<pk2> CREATOR = new QnHx();
    public final String w;
    public final int x;
    public final Bundle y;
    public final Bundle z;

    public static final class QnHx implements Parcelable.Creator<pk2> {
        @Override // android.os.Parcelable.Creator
        public final pk2 createFromParcel(Parcel parcel) {
            return new pk2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final pk2[] newArray(int i) {
            return new pk2[i];
        }
    }

    public pk2(kk2 kk2Var) {
        this.w = kk2Var.B;
        this.x = kk2Var.x.C;
        this.y = kk2Var.y;
        Bundle bundle = new Bundle();
        this.z = bundle;
        kk2Var.E.c(bundle);
    }

    public final kk2 a(Context context, dl2 dl2Var, YKK.F1 f1, xk2 xk2Var) {
        Bundle bundle = this.y;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return new kk2(context, dl2Var, bundle, f1, xk2Var, this.w, this.z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.w);
        parcel.writeInt(this.x);
        parcel.writeBundle(this.y);
        parcel.writeBundle(this.z);
    }

    public pk2(Parcel parcel) {
        this.w = parcel.readString();
        this.x = parcel.readInt();
        this.y = parcel.readBundle(pk2.class.getClassLoader());
        this.z = parcel.readBundle(pk2.class.getClassLoader());
    }
}
