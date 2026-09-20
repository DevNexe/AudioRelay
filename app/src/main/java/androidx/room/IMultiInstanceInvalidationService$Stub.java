package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class IMultiInstanceInvalidationService$Stub extends Binder implements IInterface {
    public IMultiInstanceInvalidationService$Stub() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback = null;
        if (i == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            final IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                iMultiInstanceInvalidationCallback = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMultiInstanceInvalidationCallback)) ? new IMultiInstanceInvalidationCallback(strongBinder) { // from class: androidx.room.IMultiInstanceInvalidationCallback$Stub$Proxy
                    public final IBinder w;

                    {
                        this.w = strongBinder;
                    }

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.w;
                    }

                    @Override // androidx.room.IMultiInstanceInvalidationCallback
                    public final void x(String[] strArr) {
                        Parcel parcelObtain = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                            parcelObtain.writeStringArray(strArr);
                            this.w.transact(1, parcelObtain, null, 1);
                        } finally {
                            parcelObtain.recycle();
                        }
                    }
                } : (IMultiInstanceInvalidationCallback) iInterfaceQueryLocalInterface;
            }
            int iL0 = ((MultiInstanceInvalidationService.AnonymousClass2) this).L0(iMultiInstanceInvalidationCallback, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iL0);
            return true;
        }
        if (i != 2) {
            if (i == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                ((MultiInstanceInvalidationService.AnonymousClass2) this).K0(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
        parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        final IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            iMultiInstanceInvalidationCallback = (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof IMultiInstanceInvalidationCallback)) ? new IMultiInstanceInvalidationCallback(strongBinder2) { // from class: androidx.room.IMultiInstanceInvalidationCallback$Stub$Proxy
                public final IBinder w;

                {
                    this.w = strongBinder2;
                }

                @Override // android.os.IInterface
                public final IBinder asBinder() {
                    return this.w;
                }

                @Override // androidx.room.IMultiInstanceInvalidationCallback
                public final void x(String[] strArr) {
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                        parcelObtain.writeStringArray(strArr);
                        this.w.transact(1, parcelObtain, null, 1);
                    } finally {
                        parcelObtain.recycle();
                    }
                }
            } : (IMultiInstanceInvalidationCallback) iInterfaceQueryLocalInterface2;
        }
        int i3 = parcel.readInt();
        MultiInstanceInvalidationService.AnonymousClass2 anonymousClass2 = (MultiInstanceInvalidationService.AnonymousClass2) this;
        synchronized (MultiInstanceInvalidationService.this.y) {
            MultiInstanceInvalidationService.this.y.unregister(iMultiInstanceInvalidationCallback);
            MultiInstanceInvalidationService.this.x.remove(Integer.valueOf(i3));
        }
        parcel2.writeNoException();
        return true;
    }
}
