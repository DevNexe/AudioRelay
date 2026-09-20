package androidx.media2.common;

import android.annotation.SuppressLint;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImplListSlice implements Parcelable {
    public static final Parcelable.Creator<ParcelImplListSlice> CREATOR = new CQf();
    public final List<ParcelImpl> w;

    public class CQf implements Parcelable.Creator<ParcelImplListSlice> {
        @Override // android.os.Parcelable.Creator
        public final ParcelImplListSlice createFromParcel(Parcel parcel) {
            return new ParcelImplListSlice(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelImplListSlice[] newArray(int i) {
            return new ParcelImplListSlice[i];
        }
    }

    public class QnHx extends Binder {
        public final /* synthetic */ int w;

        public QnHx(int i) {
            this.w = i;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int i4 = parcel.readInt();
            while (true) {
                i3 = this.w;
                if (i4 >= i3 || parcel2.dataSize() >= 65536) {
                    break;
                }
                parcel2.writeInt(1);
                parcel2.writeParcelable(ParcelImplListSlice.this.w.get(i4), i2);
                i4++;
            }
            if (i4 < i3) {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    public ParcelImplListSlice(ArrayList arrayList) {
        this.w = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<ParcelImpl> list = this.w;
        int size = list.size();
        parcel.writeInt(size);
        if (size > 0) {
            int i2 = 0;
            while (i2 < size && i2 < 1 && parcel.dataSize() < 65536) {
                parcel.writeInt(1);
                parcel.writeParcelable(list.get(i2), i);
                i2++;
            }
            if (i2 < size) {
                parcel.writeInt(0);
                parcel.writeStrongBinder(new QnHx(size));
            }
        }
    }

    public ParcelImplListSlice(Parcel parcel) {
        int i = parcel.readInt();
        this.w = new ArrayList(i);
        if (i <= 0) {
            return;
        }
        int i2 = 0;
        while (i2 < i && parcel.readInt() != 0) {
            this.w.add((ParcelImpl) parcel.readParcelable(ParcelImpl.class.getClassLoader()));
            i2++;
        }
        if (i2 >= i) {
            return;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        while (i2 < i) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i2);
                try {
                    strongBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (i2 < i && parcelObtain2.readInt() != 0) {
                        this.w.add((ParcelImpl) parcelObtain2.readParcelable(ParcelImpl.class.getClassLoader()));
                        i2++;
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (RemoteException e) {
                    Log.w("ParcelImplListSlice", "Failure retrieving array; only received " + i2 + " of " + i, e);
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return;
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
    }
}
