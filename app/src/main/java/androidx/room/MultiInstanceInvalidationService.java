package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {
    public int w = 0;
    public final HashMap<Integer, String> x = new HashMap<>();
    public final QnHx y = new QnHx();
    public final IMultiInstanceInvalidationService$Stub z = new AnonymousClass2();

    /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationService$2, reason: invalid class name */
    public class AnonymousClass2 extends IMultiInstanceInvalidationService$Stub {
        public AnonymousClass2() {
        }

        public final void K0(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.y) {
                String str = MultiInstanceInvalidationService.this.x.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = MultiInstanceInvalidationService.this.y.beginBroadcast();
                for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                    try {
                        int iIntValue = ((Integer) MultiInstanceInvalidationService.this.y.getBroadcastCookie(i2)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.x.get(Integer.valueOf(iIntValue));
                        if (i != iIntValue && str.equals(str2)) {
                            try {
                                MultiInstanceInvalidationService.this.y.getBroadcastItem(i2).x(strArr);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                    } catch (Throwable th) {
                        MultiInstanceInvalidationService.this.y.finishBroadcast();
                        throw th;
                    }
                }
                MultiInstanceInvalidationService.this.y.finishBroadcast();
            }
        }

        public final int L0(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.y) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.w + 1;
                multiInstanceInvalidationService.w = i;
                if (multiInstanceInvalidationService.y.register(iMultiInstanceInvalidationCallback, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.x.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService.this.w--;
                return 0;
            }
        }
    }

    public class QnHx extends RemoteCallbackList<IMultiInstanceInvalidationCallback> {
        public QnHx() {
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(IInterface iInterface, Object obj) {
            MultiInstanceInvalidationService.this.x.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.z;
    }
}
