package defpackage;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class nx5 extends X509Certificate {
    public final X509Certificate w;
    public final byte[] x;

    public nx5(X509Certificate x509Certificate, byte[] bArr) {
        this.w = x509Certificate;
        this.x = bArr;
    }

    @Override // java.security.cert.X509Certificate
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
        this.w.checkValidity();
    }

    @Override // java.security.cert.X509Certificate
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        this.w.checkValidity(date);
    }

    @Override // java.security.cert.X509Certificate
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int getBasicConstraints() {
        return this.w.getBasicConstraints();
    }

    @Override // java.security.cert.X509Extension
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Set getCriticalExtensionOIDs() {
        return this.w.getCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Extension
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final byte[] getExtensionValue(String str) {
        return this.w.getExtensionValue(str);
    }

    @Override // java.security.cert.X509Certificate
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Principal getIssuerDN() {
        return this.w.getIssuerDN();
    }

    @Override // java.security.cert.X509Certificate
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final boolean[] getIssuerUniqueID() {
        return this.w.getIssuerUniqueID();
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.x;
    }

    @Override // java.security.cert.X509Certificate
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final boolean[] getKeyUsage() {
        return this.w.getKeyUsage();
    }

    @Override // java.security.cert.X509Extension
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Set getNonCriticalExtensionOIDs() {
        return this.w.getNonCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Certificate
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Date getNotAfter() {
        return this.w.getNotAfter();
    }

    @Override // java.security.cert.X509Certificate
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final Date getNotBefore() {
        return this.w.getNotBefore();
    }

    @Override // java.security.cert.Certificate
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final PublicKey getPublicKey() {
        return this.w.getPublicKey();
    }

    @Override // java.security.cert.X509Certificate
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final BigInteger getSerialNumber() {
        return this.w.getSerialNumber();
    }

    @Override // java.security.cert.X509Certificate
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final String getSigAlgName() {
        return this.w.getSigAlgName();
    }

    @Override // java.security.cert.X509Certificate
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final String getSigAlgOID() {
        return this.w.getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final byte[] getSigAlgParams() {
        return this.w.getSigAlgParams();
    }

    @Override // java.security.cert.X509Certificate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final byte[] getSignature() {
        return this.w.getSignature();
    }

    @Override // java.security.cert.X509Certificate
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Principal getSubjectDN() {
        return this.w.getSubjectDN();
    }

    @Override // java.security.cert.X509Certificate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final boolean[] getSubjectUniqueID() {
        return this.w.getSubjectUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final byte[] getTBSCertificate() {
        return this.w.getTBSCertificate();
    }

    @Override // java.security.cert.X509Certificate
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final int getVersion() {
        return this.w.getVersion();
    }

    @Override // java.security.cert.X509Extension
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final boolean hasUnsupportedCriticalExtension() {
        return this.w.hasUnsupportedCriticalExtension();
    }

    @Override // java.security.cert.Certificate
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return this.w.toString();
    }

    @Override // java.security.cert.Certificate
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        this.w.verify(publicKey);
    }

    @Override // java.security.cert.Certificate
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        this.w.verify(publicKey, str);
    }
}
