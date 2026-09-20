package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new QnHx();
    public IResultReceiver w;

    public class MyResultReceiver extends IResultReceiver.Stub {
        public MyResultReceiver() {
        }
    }

    public class QnHx implements Parcelable.Creator<ResultReceiver> {
        @Override // android.os.Parcelable.Creator
        public final ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    public ResultReceiver(Parcel parcel) {
        IResultReceiver proxy;
        IBinder strongBinder = parcel.readStrongBinder();
        int i = IResultReceiver.Stub.w;
        if (strongBinder == null) {
            proxy = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            proxy = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IResultReceiver)) ? new IResultReceiver.Stub.Proxy(strongBinder) : (IResultReceiver) iInterfaceQueryLocalInterface;
        }
        this.w = proxy;
    }

    public void a(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.w == null) {
                this.w = new MyResultReceiver();
            }
            parcel.writeStrongBinder(this.w.asBinder());
        }
    }
}
