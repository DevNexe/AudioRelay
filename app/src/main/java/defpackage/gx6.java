package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class gx6 implements ex6 {
    public static gx6 c;

    @Nullable
    public final Context a;

    @Nullable
    public final fx6 b;

    public gx6() {
        this.a = null;
        this.b = null;
    }

    public gx6(Context context) {
        this.a = context;
        fx6 fx6Var = new fx6();
        this.b = fx6Var;
        context.getContentResolver().registerContentObserver(lw6.a, true, fx6Var);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005a A[Catch: all -> 0x0065, TryCatch #2 {all -> 0x0065, blocks: (B:14:0x001c, B:16:0x0020, B:21:0x0026, B:23:0x002a, B:24:0x0032, B:38:0x005e, B:39:0x0060, B:27:0x0038, B:29:0x003e, B:36:0x005a, B:33:0x004b), top: B:67:0x001c, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x005e A[Catch: all -> 0x0065, TryCatch #2 {all -> 0x0065, blocks: (B:14:0x001c, B:16:0x0020, B:21:0x0026, B:23:0x002a, B:24:0x0032, B:38:0x005e, B:39:0x0060, B:27:0x0038, B:29:0x003e, B:36:0x005a, B:33:0x004b), top: B:67:0x001c, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0063  */
    @Override // defpackage.ex6
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String zzb(String str) {
        Object objG;
        boolean z;
        Context context = this.a;
        if (context != null) {
            UserManager userManager = rw6.a;
            boolean z2 = false;
            if ((Build.VERSION.SDK_INT >= 24) && !rw6.b) {
                synchronized (rw6.class) {
                    try {
                        if (!rw6.b) {
                            int i = 1;
                            while (true) {
                                if (i <= 2) {
                                    if (rw6.a == null) {
                                        rw6.a = (UserManager) context.getSystemService(UserManager.class);
                                    }
                                    UserManager userManager2 = rw6.a;
                                    if (userManager2 == null) {
                                        z = true;
                                    } else {
                                        try {
                                            z = userManager2.isUserUnlocked() || !userManager2.isUserRunning(Process.myUserHandle());
                                            if (z) {
                                                rw6.a = null;
                                            }
                                        } catch (NullPointerException e) {
                                            Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                                            rw6.a = null;
                                            i++;
                                        }
                                    }
                                    if (z) {
                                        rw6.b = true;
                                    }
                                    if (!z) {
                                        z2 = true;
                                    }
                                }
                                if (z) {
                                    rw6.a = null;
                                }
                                if (z) {
                                    rw6.b = true;
                                }
                                if (!z) {
                                    z2 = true;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (!z2) {
                try {
                    try {
                        d7G d7g = new d7G(19, this, str);
                        try {
                            objG = d7g.g();
                        } catch (SecurityException unused) {
                            long jClearCallingIdentity = Binder.clearCallingIdentity();
                            try {
                                objG = d7g.g();
                            } finally {
                                Binder.restoreCallingIdentity(jClearCallingIdentity);
                            }
                        }
                        return (String) objG;
                    } catch (IllegalStateException e2) {
                        e = e2;
                        Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
                        return null;
                    } catch (NullPointerException e3) {
                        e = e3;
                        Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
                        return null;
                    }
                } catch (SecurityException e4) {
                    e = e4;
                    Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
                    return null;
                }
            }
        }
        return null;
    }
}
