package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public enum g31 implements f31 {
    Active,
    ActiveParent,
    Captured,
    Deactivated,
    DeactivatedParent,
    Inactive;

    @Override // defpackage.f31
    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                return true;
            }
            if (iOrdinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }

    @Override // defpackage.f31
    public final boolean c() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return true;
            }
            if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }

    public final boolean d() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
            if (iOrdinal == 3 || iOrdinal == 4) {
                return true;
            }
            if (iOrdinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }
}
