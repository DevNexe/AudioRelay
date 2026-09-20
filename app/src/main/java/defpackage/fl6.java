package defpackage;

import android.system.ErrnoException;
import android.system.OsConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class fl6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}
