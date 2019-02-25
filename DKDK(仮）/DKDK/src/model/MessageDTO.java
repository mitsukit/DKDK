package model;

public class MessageDTO {

	private int messageId;//メッセージid
	private int sendUserId;//送信者id
	private int receiveUserId;//受信者id
	private String message;//メッセージ内容
	private String dateTime;//DB登録時の日時

	public MessageDTO() {

	}

	/*引数に入れたもの(ログインユーザー）を
	 * DTOのフィールドにセットしてカプセル化するコンストラクター
	 * 　｜・messageDAOにて、getMessageメソッドの戻り値として使用｜　　　　　　｜
	 * 注意：引数に入れる順番を守る
	 */
	public MessageDTO(int messageId, int sendUserId,
			          int receiveUserId, String message, String dateTime) {
						this.messageId = messageId;
						this.sendUserId = sendUserId;
						this.receiveUserId = receiveUserId;
						this.message = message;
						this.dateTime = dateTime;
	}

	//ゲッター、セッター
		public int getMessageId() {
			return this.messageId;
		}
		public void setMessageId(int messageId) {
			this.messageId = messageId;
		}

		public int getSendUserId() {
			return this.sendUserId;
		}
		public void setSendUserId(int sendUserId) {
			this.sendUserId = sendUserId;
		}

		public int getReceiveUserId() {
			return this.receiveUserId;
		}
		public void setReceiveUserId(int receiveUserId) {
			this.receiveUserId = receiveUserId;
		}

		public String getMessage() {
			return this.message;
		}
		public void setMessage(String message) {
			this.message = message;
		}

		public String getDateTime() {
			return this.dateTime;
		}
		public void setDateTime(String dateTime) {
			this.dateTime = dateTime;
		}
}