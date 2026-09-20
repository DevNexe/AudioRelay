package defpackage;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public abstract class CQf implements Parcelable {
    public final Parcelable w;
    public static final QnHx x = new QnHx();
    public static final Parcelable.Creator<CQf> CREATOR = new C0002CQf();

    public class QnHx extends CQf {
    }

    public CQf() {
        this.w = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.w, i);
    }

    /* JADX INFO: renamed from: CQf$CQf, reason: collision with other inner class name */
    public class C0002CQf implements Parcelable.ClassLoaderCreator<CQf> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return CQf.x;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CQf[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final CQf createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return CQf.x;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public CQf(Parcelable parcelable) {
        if (parcelable != null) {
            this.w = parcelable == x ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public CQf(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.w = parcelable == null ? x : parcelable;
    }
}
