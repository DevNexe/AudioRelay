package android.support.customtabs;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface ICustomTabsService extends IInterface {

    public static abstract class Stub extends Binder implements ICustomTabsService {
        public static final /* synthetic */ int w = 0;

        public static class Proxy implements ICustomTabsService {
            public final IBinder w;

            public Proxy(IBinder iBinder) {
                this.w = iBinder;
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean E0() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeLong(0L);
                    if (!this.w.transact(2, parcelObtain, parcelObtain2, 0)) {
                        int i = Stub.w;
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.w;
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean f0(ICustomTabsCallback iCustomTabsCallback) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder((ICustomTabsCallback.Stub) iCustomTabsCallback);
                    if (!this.w.transact(3, parcelObtain, parcelObtain2, 0)) {
                        int i = Stub.w;
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static ICustomTabsService K0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICustomTabsService)) ? new Proxy(iBinder) : (ICustomTabsService) iInterfaceQueryLocalInterface;
        }
    }

    boolean E0();

    boolean f0(ICustomTabsCallback iCustomTabsCallback);
}
