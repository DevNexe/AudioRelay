package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface IResultReceiver extends IInterface {

    public static abstract class Stub extends Binder implements IResultReceiver {
        public static final /* synthetic */ int w = 0;

        public static class Proxy implements IResultReceiver {
            public final IBinder w;

            public Proxy(IBinder iBinder) {
                this.w = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.w;
            }
        }

        public Stub() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            }
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int i3 = parcel.readInt();
            Object objCreateFromParcel = parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null;
            ResultReceiver resultReceiver = ResultReceiver.this;
            resultReceiver.getClass();
            resultReceiver.a(i3, (Bundle) objCreateFromParcel);
            return true;
        }
    }
}
