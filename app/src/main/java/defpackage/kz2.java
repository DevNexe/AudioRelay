package defpackage;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class kz2<T> extends qp4<T> implements Parcelable {
    public static final Parcelable.Creator<kz2<Object>> CREATOR = new QnHx();

    public static final class QnHx implements Parcelable.ClassLoaderCreator<kz2<Object>> {
        public static kz2 a(Parcel parcel, ClassLoader classLoader) {
            rp4 rp4Var;
            if (classLoader == null) {
                classLoader = QnHx.class.getClassLoader();
            }
            Object value = parcel.readValue(classLoader);
            int i = parcel.readInt();
            if (i == 0) {
                rp4Var = eo2.a;
            } else if (i == 1) {
                rp4Var = tv4.a;
            } else {
                if (i != 2) {
                    throw new IllegalStateException(ex0.b("Unsupported MutableState policy ", i, " was restored"));
                }
                rp4Var = ml3.a;
            }
            return new kz2(value, rp4Var);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* bridge */ /* synthetic */ kz2<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return a(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new kz2[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return a(parcel, null);
        }
    }

    public kz2(T t, rp4<T> rp4Var) {
        super(t, rp4Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        eo2 eo2Var = eo2.a;
        rp4<T> rp4Var = this.w;
        if (ur1.a(rp4Var, eo2Var)) {
            i2 = 0;
        } else if (ur1.a(rp4Var, tv4.a)) {
            i2 = 1;
        } else {
            if (!ur1.a(rp4Var, ml3.a)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
