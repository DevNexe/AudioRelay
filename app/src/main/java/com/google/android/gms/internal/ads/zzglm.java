package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class zzglm {
    public final ECPublicKey a;

    public zzglm(ECPublicKey eCPublicKey) {
        this.a = eCPublicKey;
    }

    public final zzgll zza(String str, byte[] bArr, byte[] bArr2, int i, int i2) throws GeneralSecurityException {
        char c;
        int i3;
        byte[] bArr3;
        int i4;
        byte[] bArr4;
        ECPublicKey eCPublicKey = this.a;
        KeyPair keyPairZzb = zzgln.zzb(eCPublicKey.getParams());
        ECPublicKey eCPublicKey2 = (ECPublicKey) keyPairZzb.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairZzb.getPrivate();
        try {
            ECParameterSpec params = eCPublicKey.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            if (!params.getCurve().equals(params2.getCurve()) || !params.getGenerator().equals(params2.getGenerator()) || !params.getOrder().equals(params2.getOrder()) || params.getCofactor() != params2.getCofactor()) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            ECPoint w = eCPublicKey.getW();
            zzgln.a(w, eCPrivateKey.getParams().getCurve());
            PublicKey publicKeyGeneratePublic = ((KeyFactory) zzglp.zzg.zza("EC")).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
            KeyAgreement keyAgreement = (KeyAgreement) zzglp.zze.zza("ECDH");
            keyAgreement.init(eCPrivateKey);
            int i5 = 1;
            try {
                keyAgreement.doPhase(publicKeyGeneratePublic, true);
                byte[] bArrGenerateSecret = keyAgreement.generateSecret();
                EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                BigInteger bigInteger = new BigInteger(1, bArrGenerateSecret);
                if (bigInteger.signum() == -1 || bigInteger.compareTo(zzgln.zza(curve)) >= 0) {
                    throw new GeneralSecurityException("shared secret is out of range");
                }
                BigInteger bigIntegerZza = zzgln.zza(curve);
                BigInteger bigIntegerMod = bigInteger.multiply(bigInteger).add(curve.getA()).multiply(bigInteger).add(curve.getB()).mod(bigIntegerZza);
                if (bigIntegerZza.signum() != 1) {
                    throw new InvalidAlgorithmParameterException("p must be positive");
                }
                BigInteger bigIntegerMod2 = bigIntegerMod.mod(bigIntegerZza);
                BigInteger bigIntegerAdd = BigInteger.ZERO;
                if (!bigIntegerMod2.equals(bigIntegerAdd)) {
                    if (bigIntegerZza.testBit(0) && bigIntegerZza.testBit(1)) {
                        bigIntegerAdd = bigIntegerMod2.modPow(bigIntegerZza.add(BigInteger.ONE).shiftRight(2), bigIntegerZza);
                    } else if (!bigIntegerZza.testBit(0) || bigIntegerZza.testBit(1)) {
                        bigIntegerAdd = null;
                    } else {
                        bigIntegerAdd = BigInteger.ONE;
                        BigInteger bigIntegerShiftRight = bigIntegerZza.subtract(bigIntegerAdd).shiftRight(1);
                        int i6 = 0;
                        while (true) {
                            BigInteger bigIntegerMod3 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod2).mod(bigIntegerZza);
                            if (!bigIntegerMod3.equals(BigInteger.ZERO)) {
                                BigInteger bigIntegerModPow = bigIntegerMod3.modPow(bigIntegerShiftRight, bigIntegerZza);
                                BigInteger bigIntegerMod4 = BigInteger.ONE;
                                if (bigIntegerModPow.add(bigIntegerMod4).equals(bigIntegerZza)) {
                                    BigInteger bigIntegerShiftRight2 = bigIntegerZza.add(bigIntegerMod4).shiftRight(i5);
                                    BigInteger bigInteger2 = bigIntegerAdd;
                                    for (int iBitLength = bigIntegerShiftRight2.bitLength() - 2; iBitLength >= 0; iBitLength--) {
                                        BigInteger bigIntegerMultiply = bigInteger2.multiply(bigIntegerMod4);
                                        BigInteger bigIntegerMod5 = bigInteger2.multiply(bigInteger2).add(bigIntegerMod4.multiply(bigIntegerMod4).mod(bigIntegerZza).multiply(bigIntegerMod3)).mod(bigIntegerZza);
                                        BigInteger bigIntegerMod6 = bigIntegerMultiply.add(bigIntegerMultiply).mod(bigIntegerZza);
                                        if (bigIntegerShiftRight2.testBit(iBitLength)) {
                                            BigInteger bigIntegerMod7 = bigIntegerMod5.multiply(bigIntegerAdd).add(bigIntegerMod6.multiply(bigIntegerMod3)).mod(bigIntegerZza);
                                            bigIntegerMod4 = bigIntegerAdd.multiply(bigIntegerMod6).add(bigIntegerMod5).mod(bigIntegerZza);
                                            bigInteger2 = bigIntegerMod7;
                                        } else {
                                            bigInteger2 = bigIntegerMod5;
                                            bigIntegerMod4 = bigIntegerMod6;
                                        }
                                    }
                                    bigIntegerAdd = bigInteger2;
                                } else {
                                    if (!bigIntegerModPow.equals(bigIntegerMod4)) {
                                        throw new InvalidAlgorithmParameterException("p is not prime");
                                    }
                                    bigIntegerAdd = bigIntegerAdd.add(bigIntegerMod4);
                                    i6++;
                                    if (i6 == 128 && !bigIntegerZza.isProbablePrime(80)) {
                                        throw new InvalidAlgorithmParameterException("p is not prime");
                                    }
                                    i5 = 1;
                                }
                            }
                        }
                    }
                    if (bigIntegerAdd != null && bigIntegerAdd.multiply(bigIntegerAdd).mod(bigIntegerZza).compareTo(bigIntegerMod2) != 0) {
                        throw new GeneralSecurityException("Could not find a modular square root");
                    }
                }
                if (!bigIntegerAdd.testBit(0)) {
                    bigIntegerZza.subtract(bigIntegerAdd).mod(bigIntegerZza);
                }
                EllipticCurve curve2 = eCPublicKey2.getParams().getCurve();
                ECPoint w2 = eCPublicKey2.getW();
                zzgln.a(w2, curve2);
                int iBitLength2 = (zzgln.zza(curve2).subtract(BigInteger.ONE).bitLength() + 7) / 8;
                int i7 = i2 - 1;
                if (i7 != 0) {
                    if (i7 != 2) {
                        int i8 = iBitLength2 + 1;
                        bArr4 = new byte[i8];
                        byte[] byteArray = w2.getAffineX().toByteArray();
                        int length = byteArray.length;
                        c = 0;
                        System.arraycopy(byteArray, 0, bArr4, i8 - length, length);
                        bArr4[0] = true != w2.getAffineY().testBit(0) ? (byte) 2 : (byte) 3;
                    } else {
                        int i9 = iBitLength2 + iBitLength2;
                        bArr4 = new byte[i9];
                        byte[] byteArray2 = w2.getAffineX().toByteArray();
                        int length2 = byteArray2.length;
                        if (length2 > iBitLength2) {
                            byteArray2 = Arrays.copyOfRange(byteArray2, length2 - iBitLength2, length2);
                        }
                        byte[] byteArray3 = w2.getAffineY().toByteArray();
                        int length3 = byteArray3.length;
                        if (length3 > iBitLength2) {
                            byteArray3 = Arrays.copyOfRange(byteArray3, length3 - iBitLength2, length3);
                        }
                        int length4 = byteArray3.length;
                        c = 0;
                        System.arraycopy(byteArray3, 0, bArr4, i9 - length4, length4);
                        int length5 = byteArray2.length;
                        System.arraycopy(byteArray2, 0, bArr4, iBitLength2 - length5, length5);
                    }
                    bArr3 = bArr4;
                    i4 = 2;
                    i3 = 1;
                } else {
                    c = 0;
                    i3 = 1;
                    int i10 = iBitLength2 + iBitLength2 + 1;
                    bArr3 = new byte[i10];
                    byte[] byteArray4 = w2.getAffineX().toByteArray();
                    byte[] byteArray5 = w2.getAffineY().toByteArray();
                    int length6 = byteArray5.length;
                    System.arraycopy(byteArray5, 0, bArr3, i10 - length6, length6);
                    int length7 = byteArray4.length;
                    System.arraycopy(byteArray4, 0, bArr3, (iBitLength2 + 1) - length7, length7);
                    bArr3[0] = 4;
                    i4 = 2;
                }
                byte[][] bArr5 = new byte[i4][];
                bArr5[c] = bArr3;
                bArr5[i3] = bArrGenerateSecret;
                byte[] bArrZzc = zzgle.zzc(bArr5);
                Mac mac = (Mac) zzglp.zzb.zza(str);
                if (i > mac.getMacLength() * 255) {
                    throw new GeneralSecurityException("size too large");
                }
                if (bArr == null || bArr.length == 0) {
                    mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
                } else {
                    mac.init(new SecretKeySpec(bArr, str));
                }
                byte[] bArrDoFinal = mac.doFinal(bArrZzc);
                byte[] bArr6 = new byte[i];
                mac.init(new SecretKeySpec(bArrDoFinal, str));
                byte[] bArr7 = new byte[0];
                int i11 = 0;
                while (true) {
                    mac.update(bArr7);
                    mac.update(bArr2);
                    mac.update((byte) i3);
                    byte[] bArrDoFinal2 = mac.doFinal();
                    int length8 = bArrDoFinal2.length;
                    int i12 = i11 + length8;
                    if (i12 >= i) {
                        System.arraycopy(bArrDoFinal2, 0, bArr6, i11, i - i11);
                        return new zzgll(bArr3, bArr6);
                    }
                    System.arraycopy(bArrDoFinal2, 0, bArr6, i11, length8);
                    i3++;
                    bArr7 = bArrDoFinal2;
                    i11 = i12;
                }
            } catch (IllegalStateException e) {
                throw new GeneralSecurityException(e);
            }
        } catch (IllegalArgumentException | NullPointerException e2) {
            throw new GeneralSecurityException(e2);
        }
    }
}
